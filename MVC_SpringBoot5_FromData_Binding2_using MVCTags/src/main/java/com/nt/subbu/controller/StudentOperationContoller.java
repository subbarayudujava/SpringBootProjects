package com.nt.subbu.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.subbu.model.Student;

@Controller
public class StudentOperationContoller {

	@GetMapping("/")
	public String showHome() {
		//return Logical View name
		return "welcome";
	}
	@GetMapping("/register")
	public String showform(@ModelAttribute("stud") Student st) {
		//return Logical View name
		return "student_register";
	}

	@PostMapping("/register")
	public String processStudent(Map<String, Object> map, @ModelAttribute("stud") Student st) {
   System.out.println("Student object data :"+st);
		String grad = null;
		if (st.getAvg() >= 75) {
			grad = "Firs Class with Dist";
		} else if (st.getAvg() >= 60) {
			grad = "first class";
		} else if (st.getAvg() >= 50) {
			grad = "second class";
		} else if (st.getAvg() >= 35) {
			grad = "Third  class";
		} else
			grad = "fail";
		map.put("result", grad);
		return "show_register";
	}

}
