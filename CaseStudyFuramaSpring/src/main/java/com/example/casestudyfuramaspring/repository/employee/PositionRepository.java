package com.example.casestudyfuramaspring.repository.employee;

import com.example.casestudyfuramaspring.entity.employee.Position;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PositionRepository extends JpaRepository<Position,Integer> {
}
