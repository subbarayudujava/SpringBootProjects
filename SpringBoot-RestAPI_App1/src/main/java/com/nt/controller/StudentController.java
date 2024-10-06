package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nt.entity.StudentEntity;
import com.nt.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService service;

	@PostMapping("/insert")
	public String employeDataInserted(@RequestBody StudentEntity student) {

		return service.insertData(student);
	}
	@PostMapping("/insertAll")
	public String insertData(@RequestBody List<StudentEntity> entity) {
		return service.insertMutlipleData(entity);
	}
	
	@GetMapping("/get")
	public List<StudentEntity> getData(){
	return service.getEmployeeData();
	
	}
	@GetMapping("/delete")
	public String delete(@RequestParam Integer id) {
		return service.deleteData(id);
	}
}
