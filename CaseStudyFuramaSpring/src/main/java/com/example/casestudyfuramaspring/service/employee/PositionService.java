package com.example.casestudyfuramaspring.service.employee;

import com.example.casestudyfuramaspring.entity.employee.Position;

import java.util.List;

public interface PositionService {
    Position findById(Integer id);
    List<Position> findAllPosition();
}
