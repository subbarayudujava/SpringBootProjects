package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.entity.EmployeeEntity;
import com.nt.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@PostMapping("/Rigister")
	public String registerEmployee(@RequestBody EmployeeEntity employee) {
		employeeService.registerEmployee(employee);
		return "data is rigistar";

	}

	@GetMapping("/findAll")
	public List<EmployeeEntity> finEmployeeEntities() {
		return employeeService.findallEmployee();
	}

	@PostMapping("/")
	public String multipleEmployee(@RequestBody List<EmployeeEntity> employeeEntities) {
		return employeeService.multipleEmployee(employeeEntities);
	}

	/*@GetMapping("/salary")
	public EmployeeEntity findGraterSalary() {
	
		return employeeService.findGraterSalary();
	}*/

	@GetMapping("/salary")
	public Double findGraterSalary() {

		return employeeService.findGraterSalary();
	}
}
