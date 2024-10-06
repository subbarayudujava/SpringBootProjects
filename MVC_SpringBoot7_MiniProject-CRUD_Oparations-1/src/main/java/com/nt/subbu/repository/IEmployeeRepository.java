package com.nt.subbu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nt.subbu.model.Employee;
@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {

}
