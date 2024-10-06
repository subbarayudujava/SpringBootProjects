package com.nt.service;

import java.util.List;

import com.nt.entity.EmployeeEntity;

public interface EmployeeService {

	String registerEmployee(EmployeeEntity employee);//single data inserted

	String multipleEmployee(List<EmployeeEntity> employee);//total data 

	List<EmployeeEntity> findallEmployee();//multiple data inserted

	//EmployeeEntity findGraterSalary();
	Double findGraterSalary();

 
}
