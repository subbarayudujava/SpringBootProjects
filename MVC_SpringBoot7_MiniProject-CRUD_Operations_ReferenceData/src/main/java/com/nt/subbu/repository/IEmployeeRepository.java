package com.nt.subbu.repository;

import org.springframework.data.repository.CrudRepository;

import com.nt.subbu.model.Employee;

public interface IEmployeeRepository extends CrudRepository<Employee, Integer> {

}
