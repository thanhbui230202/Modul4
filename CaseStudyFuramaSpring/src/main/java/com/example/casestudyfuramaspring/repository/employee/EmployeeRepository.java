package com.example.casestudyfuramaspring.repository.employee;

import com.example.casestudyfuramaspring.entity.employee.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, String> {
}
