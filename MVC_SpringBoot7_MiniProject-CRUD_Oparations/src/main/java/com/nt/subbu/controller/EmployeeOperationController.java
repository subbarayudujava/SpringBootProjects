package com.nt.subbu.controller;

import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.querydsl.binding.QuerydslPredicate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nt.subbu.model.Employee;
import com.nt.subbu.service.IEmployeeService;

import ch.qos.logback.core.joran.util.beans.BeanUtil;

@Controller
public class EmployeeOperationController {

	@Autowired
	private IEmployeeService empService;

	@GetMapping("/")
	public String showHomepage() {
		System.out.println("EmployeeOperationController.showHomepage()");
		//return logical view Name
		return "home1";
	}

	@GetMapping("/emp_report")
	public String getEmployeesReport(Map<String, Object> map) {
		System.out.println("EmployeeOperationController.showEmployeereport()");
		Iterable<Employee> emp = empService.getAllEmployees();
		//KEEP THE RESULT IN map ATTRIBUTE
		map.put("empList", emp);
		System.out.println("Employees Data");
		emp.forEach(System.out::println);
		return "show_employee_report";
	}

	@GetMapping("/emp_add")
	public String showformEmployee(@ModelAttribute("emp") Employee emp) {
		System.out.println("EmployeeOperationController.showformEmployee()");
		return "register_employee";
	}

	/*@PostMapping("/emp_add")
	public String saveEmployee(@ModelAttribute("emp") Employee emp,Map<String, Object> map) {
		String ob=empService.registerEmployee(emp);
		Iterable<Employee> ite=empService.getAllEmployee();
		//KEEP THE RESULT IN map ATTRIBUTE
		map.put("result",ob);
		map.put("empList", ite);
		return "show_employee_report";
	}*/
	// another way 
	/*@PostMapping("/emp_add")
	public String saveEmployee(@ModelAttribute("emp") Employee emp,Map<String, Object> map) {
		System.out.println("EmployeeOperationController.saveEmployee()");
		String ob=empService.registerEmployee(emp);
		map.put("result",ob);
		map.put("empList", ite);
		return "redirect:emp_report";
	}*/
	//Another way same but here lvn method using easy to find redirect method
	@PostMapping("/emp_add")
	public String saveEmployee(@ModelAttribute("emp") Employee emp, RedirectAttributes atts) {
		System.out.println("EmployeeOperationController.saveEmployee()");
		String ob = empService.registerEmployee(emp);
		atts.addFlashAttribute("result", ob);
		return "redirect:emp_report";
	}

	public String showEditeEmployeData(@RequestParam("no") int no, @ModelAttribute("emp") Employee emp) {
		Employee emps = empService.getEmployeeDataByUsingId(no);
		BeanUtils.copyProperties(emps, emp);
		return "update_employee";
	}
}
