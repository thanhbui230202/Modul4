package com.example.casestudyfuramaspring.controller;

import com.example.casestudyfuramaspring.dto.employee.EmployeeDto;
import com.example.casestudyfuramaspring.entity.employee.Division;
import com.example.casestudyfuramaspring.entity.employee.EducationDegree;
import com.example.casestudyfuramaspring.entity.employee.Employee;
import com.example.casestudyfuramaspring.entity.employee.Position;
import com.example.casestudyfuramaspring.entity.user.User;
import com.example.casestudyfuramaspring.service.employee.DivisionService;
import com.example.casestudyfuramaspring.service.employee.EducationDegreeService;
import com.example.casestudyfuramaspring.service.employee.EmployeeService;
import com.example.casestudyfuramaspring.service.employee.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private DivisionService divisionService;
    @Autowired
    private EducationDegreeService educationDegreeService;
    @Autowired
    private PositionService positionService;
    @GetMapping("")
    public String displayList(Model model,
                              @RequestParam("page") Optional<Integer> page,
                              @RequestParam("size")Optional<Integer> size,
                              @RequestParam("sort")Optional<String> sort){
        int currentPage = page.orElse(1);
        int pageSize = size.orElse(5);
        String sortField = sort.orElse("employeeName");
        Pageable pageable = PageRequest.of(currentPage - 1, pageSize, Sort.by(sortField).descending());
        Page<Employee> employees = employeeService.findAllEmployee(pageable);
        model.addAttribute("employees", employees);
        int totalPage = employees.getTotalPages();
        model.addAttribute("currentPage", currentPage);
        if (totalPage > 1) {
            List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPage)
                    .boxed()
                    .collect(Collectors.toList());
            model.addAttribute("pageNumbers", pageNumbers);
        }
        return "employee/listEmployee";
    }
    @GetMapping("/create")
    public String showCreate(Model model){
        model.addAttribute("employee",new EmployeeDto());
        model.addAttribute("positions", positionService.findAllPosition());
        model.addAttribute("educations", educationDegreeService.findAllEducation());
        model.addAttribute("divisions", divisionService.findAllDivision());
        return "employee/createEmployee";
    }
    @PostMapping("/save")
    public String doCreate(@ModelAttribute("employee") EmployeeDto employeeDto) throws ParseException {
        Position position = positionService.findById(employeeDto.getPosition());
        EducationDegree educationDegree = educationDegreeService.findById(employeeDto.getEducationDegree());
        Division division = divisionService.findById(employeeDto.getDivision());
        Employee newEmployee = convertDto(employeeDto, position, educationDegree, division);
        employeeService.create(newEmployee);
        return "redirect:/employee";
    }


    @GetMapping("/edit")
    public String showUpdate(Model model,@RequestParam("id") String id,@RequestParam("page") int currentPage){
        model.addAttribute("employee",employeeService.findById(id));
        model.addAttribute("positions", positionService.findAllPosition());
        model.addAttribute("educations", educationDegreeService.findAllEducation());
        model.addAttribute("divisions", divisionService.findAllDivision());
        model.addAttribute("currentPage",currentPage);
        return "employee/updateEmployee";
    }
    @PostMapping("/update")
    public String doUpdate(@RequestParam(value = "currentPage",required = false) Integer currentPage, @ModelAttribute("employee") EmployeeDto employeeDto) throws ParseException {
        Position position = positionService.findById(employeeDto.getPosition());
        EducationDegree educationDegree = educationDegreeService.findById(employeeDto.getEducationDegree());
        Division division = divisionService.findById(employeeDto.getDivision());
        Employee newEmployee = convertDto(employeeDto, position, educationDegree, division);
        employeeService.update(newEmployee);
        return "redirect:/employee?page" + currentPage;
    }
    @GetMapping("/delete")
    public String delete(@RequestParam("id") String id){
        employeeService.deleteById(id);
        return "redirect:/employee";
    }
    private Employee convertDto(EmployeeDto employeeDto, Position position, EducationDegree educationDegree, Division division) throws ParseException {
        Date date1=new SimpleDateFormat("yyyy-MM-dd").parse(employeeDto.getEmployeeBirthday());
        Employee employee = new Employee();
        employee.setEmployeeId(employeeDto.getEmployeeId());
        employee.setEmployeeName(employeeDto.getEmployeeName());
        employee.setEmployeeBirthday(date1);
        employee.setEmployeeIdCard(employeeDto.getEmployeeIdCard());
        employee.setEmployeeSalary(employeeDto.getEmployeeSalary());
        employee.setEmployeePhone(employeeDto.getEmployeePhone());
        employee.setEmployeeEmail(employeeDto.getEmployeeEmail());
        employee.setEmployeeAddress(employeeDto.getEmployeeAddress());
        employee.setPosition(position);
        employee.setEducationDegree(educationDegree);
        employee.setDivision(division);
//        employee.setUser(employeeDto.getUser());
        return employee;
    }
}
