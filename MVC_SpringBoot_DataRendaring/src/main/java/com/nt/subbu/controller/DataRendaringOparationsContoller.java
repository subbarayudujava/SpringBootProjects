package com.nt.subbu.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.nt.subbu.model.Employee;

@Controller
public class DataRendaringOparationsContoller {
	
	/*  @GetMapping("/report")
	 public String sendData(Map<String, Object> map) {
	   map.put("name:", "Subbarayudu");
	   map.put("age:", 24);
	   return "show_report";
	
	 }*/
	
	/*@GetMapping("/report")
	public String sendData(Map<String, Object> map) {
	  map.put("favColore",new String[]{"red","green","yellow"});
	  map.put("nickNames",List.of("Subbarayudu","Subbu","white boy"));
	  map.put("phoneNumbers",Set.of(98989898989l,9999998889l,999888777l));
	  map.put("IdDetails",Map.of("Aadharcard",8008090,"voterCard",989765));
	  return "show_report";
	}*/
	@GetMapping("/report")
	public String sendData(Map<String, Object> map) {
		//create model class object with data 
		Employee emp=new Employee();
		emp.setEid(1001);
		emp.setEname("Subbarayudu");
		emp.setSalary(1000.0);
		emp.setVaccinated(true);
		//add model class object to model attributes
		map.put("empinfo", emp);
		return "show_report1";
		
    }
}
