package com.example.casestudyfuramaspring.service.employee;

import com.example.casestudyfuramaspring.entity.employee.EducationDegree;
import com.example.casestudyfuramaspring.repository.employee.EducationDegreeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EducationDegreeServiceImpl implements EducationDegreeService{
    @Autowired
    private EducationDegreeRepository educationDegreeRepository;
    @Override
    public EducationDegree findById(Integer id) {
        return educationDegreeRepository.findById(id).orElse(null);
    }

    @Override
    public List<EducationDegree> findAllEducation() {
        return educationDegreeRepository.findAll();
    }
}
