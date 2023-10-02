package com.example.casestudyfuramaspring.service.employee;

import com.example.casestudyfuramaspring.dto.employee.EmployeeDto;
import com.example.casestudyfuramaspring.entity.employee.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface EmployeeService {
    void create(Employee employee);
    void update(Employee employee);
    void deleteById(String id);
    Employee findById(String id);
    Page<Employee> findAllEmployee(Pageable pageable);
}
