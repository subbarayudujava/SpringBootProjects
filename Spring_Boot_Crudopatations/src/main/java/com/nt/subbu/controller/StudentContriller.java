
package com.nt.subbu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nt.subbu.entirty.StudentEntity;
import com.nt.subbu.service.StudentService;

@Controller
public class StudentContriller {

	@Autowired
	private StudentService service;

	@RequestMapping("/")
	@ResponseBody
	public String welcome() {
		return "good mornig";
	}

	@PostMapping("/register")
	@ResponseBody
	public String register(@RequestBody StudentEntity entity) {
		return service.registerStudent(entity);
	}

	@GetMapping("/findAll")
	@ResponseBody
	public List<StudentEntity> findall() {
		return service.findAll();
	}

	@DeleteMapping("/delete")
	@ResponseBody
	public String delteData(@RequestParam(value ="id") Integer id) {
		String reponse = service.delteData(id);
		return reponse;
	}
}