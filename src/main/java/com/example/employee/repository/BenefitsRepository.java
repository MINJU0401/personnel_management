package com.example.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.employee.entity.BenefitsEntity;

@Repository
public interface BenefitsRepository extends JpaRepository<BenefitsEntity, String> {
  
}
