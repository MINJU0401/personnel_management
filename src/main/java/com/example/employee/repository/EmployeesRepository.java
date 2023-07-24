package com.example.employee.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.employee.entity.EmployeesEntity;

@Repository
public interface EmployeesRepository extends JpaRepository<EmployeesEntity, String> {

  public boolean existsByName(String name);

  public EmployeesEntity findByEmployeeId(Integer EmployeeId);


  
}
