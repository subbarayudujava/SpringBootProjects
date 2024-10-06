package com.mk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mk.entity.EmployeeEntity;
import com.mk.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@PostMapping("/register")
	public String registerEmployee(@RequestBody EmployeeEntity entity) {
		return service.registerEmployee(entity);
	}//registerEmployee

	@GetMapping("/findAll")
	public List<EmployeeEntity> findAllEmployees() {
		return service.findAllEmployees();
	}

	@GetMapping("/findById")
	public EmployeeEntity findEmployeeById(@RequestParam Integer id) {
		return service.findEmployeebyId(id);
	}

	@PatchMapping("/update")
	public String updateEmployeeByName(@RequestParam Integer id, @RequestParam String name) {
		return service.updateEmployeeName(id, name);
	}

	@PutMapping("/update")
	public String updateEmployeeData(@RequestBody EmployeeEntity entity) {
		return service.updateEmployeeData(entity);
	}

	@DeleteMapping("/delete")
	public String deleteEmployeeData(@RequestParam Integer id) {
		return service.deleteEmployeeDataById(id);
	}
	
	@DeleteMapping("/deleteAll")
	public String deleteAllEmployeesData() {
		//String response = service.deleteAllEmployees();
		//return response;
		return service.deleteAllEmployees();
	}

}//class