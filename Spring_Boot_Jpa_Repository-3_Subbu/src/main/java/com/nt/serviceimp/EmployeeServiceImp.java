package com.nt.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.EmployeeEntity;
import com.nt.repository.EmployeeRepository;
import com.nt.service.EmployeeService;

@Service
public class EmployeeServiceImp implements EmployeeService  {
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public String registerEmployee(EmployeeEntity employee) {
		  employeeRepository.save(employee);
		return "Employee data  Rigisterd";
		
	}

	@Override
	public List<EmployeeEntity> findallEmployee() {
		return employeeRepository.findAll();
		 
	}

	@Override
	public String multipleEmployee(List<EmployeeEntity> employee) {
		employeeRepository.saveAll(employee);
		return"multiple data insert";
	}
	
	/*@Override
	public EmployeeEntity findGraterSalary() {
	EmployeeEntity employeeEntity= employeeRepository.findGraterSalary();
		return employeeEntity;
	}*/
	@Override
	public Double findGraterSalary() {
	 return	employeeRepository.findGraterSalary();
	}
}
