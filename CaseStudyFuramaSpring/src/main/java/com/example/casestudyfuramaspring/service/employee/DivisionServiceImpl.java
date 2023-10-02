package com.example.casestudyfuramaspring.service.employee;

import com.example.casestudyfuramaspring.entity.employee.Division;
import com.example.casestudyfuramaspring.repository.employee.DivisionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DivisionServiceImpl implements DivisionService{
    @Autowired
    private DivisionRepository divisionRepository;
    @Override
    public Division findById(Integer id) {
        return divisionRepository.findById(id).orElse(null);
    }


    @Override
    public List<Division> findAllDivision() {
        return divisionRepository.findAll();
    }
}
