package com.example.employee.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.employee.entity.EmployeesEntity;
import com.example.employee.entity.resultSet.EmployeeListResultSet;

@Repository
public interface EmployeesRepository extends JpaRepository<EmployeesEntity, String> {

  public boolean existsByName(String name);

  public EmployeesEntity findByEmployeeId(Integer EmployeeId);

  public List<EmployeeListResultSet> getEmployeeList();


  
}
