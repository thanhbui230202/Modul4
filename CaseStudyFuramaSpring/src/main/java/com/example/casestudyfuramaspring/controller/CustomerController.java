package com.example.casestudyfuramaspring.controller;

import com.example.casestudyfuramaspring.dto.customer.CustomerDto;
import com.example.casestudyfuramaspring.entity.customer.Customer;
import com.example.casestudyfuramaspring.entity.customer.CustomerType;
import com.example.casestudyfuramaspring.entity.employee.Employee;
import com.example.casestudyfuramaspring.service.customer.CustomerService;
import com.example.casestudyfuramaspring.service.customer.CustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    private CustomerTypeService customerTypeService;
    @GetMapping("")
    public String displayList(Model model,
                              @RequestParam("page") Optional<Integer> page,
                              @RequestParam("size")Optional<Integer> size,
                              @RequestParam("sort")Optional<String> sort){
        int currentPage = page.orElse(1);
        int pageSize = size.orElse(5);
        String sortField = sort.orElse("customerName");
        Pageable pageable = PageRequest.of(currentPage - 1, pageSize, Sort.by(sortField).descending());
        Page<Customer> customers = customerService.findAllCustomer(pageable);
        model.addAttribute("customers", customers);
        int totalPage = customers.getTotalPages();
        model.addAttribute("currentPage", currentPage);
        if (totalPage > 1) {
            List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPage)
                    .boxed()
                    .collect(Collectors.toList());
            model.addAttribute("pageNumbers", pageNumbers);
        }
        return "customer/listCustomer";
    }
    @GetMapping("/create")
    public String showCreate(Model model){
        model.addAttribute("customer",new CustomerDto());
        model.addAttribute("customerTypes", customerTypeService.findAllCustomerType());
        model.addAttribute("action","create");
        return "customer/createOrUpdateCustomer";
    }
    @GetMapping("/edit")
    public String showEdit(Model model, @RequestParam("id") String id, @RequestParam("page") int currentPage){
        model.addAttribute("customer",customerService.findById(id));
        model.addAttribute("customerTypes", customerTypeService.findAllCustomerType());
        model.addAttribute("action","update");
        model.addAttribute("currentPage",currentPage);
        return "customer/createOrUpdateCustomer";
    }
    @PostMapping("/save")
    public String saveCustomer(@ModelAttribute("customer") CustomerDto customerDto,@RequestParam("action") String action,
                                @RequestParam(value = "currentPage",required = false) Integer currentPage){
        CustomerType customerType = customerTypeService.findById(customerDto.getCustomerType());
        Customer customer = convertDto(customerDto,customerType);
        if ("create".equals(action)){
            customerService.create(customer);
        }else {
            customerService.update(customer);
            return "redirect:/customer?page=" + currentPage;
        }
        return "redirect:/customer";
    }
    public Customer convertDto(CustomerDto customerDto, CustomerType customerType){
        Customer customer = new Customer();
        customer.setCustomerId(customerDto.getCustomerId());
        customer.setCustomerType(customerType);
        customer.setCustomerName(customerDto.getCustomerName());
        customer.setCustomerBirthday(customerDto.getCustomerBirthday());
        customer.setCustomerGender(customerDto.isCustomerGender());
        customer.setCustomerIdCard(customerDto.getCustomerIdCard());
        customer.setCustomerPhone(customerDto.getCustomerPhone());
        customer.setCustomerEmail(customerDto.getCustomerEmail());
        customer.setCustomerAddress(customerDto.getCustomerAddress());
        return customer;
    }
}
