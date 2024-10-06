package com.mk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mk.entity.EmployeeEntity;

public interface EmployeeRepopository extends JpaRepository<EmployeeEntity, Integer>{

}
