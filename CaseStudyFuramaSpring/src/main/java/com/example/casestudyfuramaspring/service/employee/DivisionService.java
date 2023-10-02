package com.example.casestudyfuramaspring.service.employee;

import com.example.casestudyfuramaspring.entity.employee.Division;

import java.util.List;

public interface DivisionService {
    Division findById(Integer id);
    List<Division> findAllDivision();
}
