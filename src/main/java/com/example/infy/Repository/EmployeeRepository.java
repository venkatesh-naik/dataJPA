package com.example.infy.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.infy.model.EmployeeEntity;

@Repository
public interface EmployeeRepository extends  JpaRepository<EmployeeEntity, Long>{

}
