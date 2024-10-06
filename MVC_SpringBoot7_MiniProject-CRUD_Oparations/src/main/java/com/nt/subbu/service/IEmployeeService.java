package com.nt.subbu.service;

import com.nt.subbu.model.Employee;

public interface IEmployeeService {

	public Iterable<Employee> getAllEmployees();// get all data at a time

	public String registerEmployee(Employee emp);// add the data by using first get mothod that method go into a post method

	// update data by id value
	public Employee getEmployeeDataByUsingId(Integer empno);
}
