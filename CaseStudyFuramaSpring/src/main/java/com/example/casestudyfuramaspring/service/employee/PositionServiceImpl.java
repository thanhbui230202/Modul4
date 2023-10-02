package com.example.casestudyfuramaspring.service.employee;

import com.example.casestudyfuramaspring.entity.employee.Position;
import com.example.casestudyfuramaspring.repository.employee.PositionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PositionServiceImpl implements PositionService{
    @Autowired
    private PositionRepository positionRepository;
    @Override
    public Position findById(Integer id) {
        return positionRepository.findById(id).orElse(null);
    }

    @Override
    public List<Position> findAllPosition() {
        return positionRepository.findAll();
    }
}
