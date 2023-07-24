package com.example.employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.employee.entity.BenefitsEntity;
import com.example.employee.entity.primaryKey.BenefitsPk;

@Repository
public interface BenefitsRepository extends JpaRepository<BenefitsEntity, BenefitsPk> {

  List<BenefitsEntity> findAllByEmployeeId(Integer employeeId);
  
}
