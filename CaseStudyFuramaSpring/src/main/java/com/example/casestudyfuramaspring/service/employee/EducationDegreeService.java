package com.example.casestudyfuramaspring.service.employee;

import com.example.casestudyfuramaspring.entity.employee.EducationDegree;

import java.util.List;

public interface EducationDegreeService {
    EducationDegree findById(Integer id);
    List<EducationDegree> findAllEducation();
}
