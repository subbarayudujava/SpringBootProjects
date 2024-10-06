package com.nt.subbu.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DataController {

	/*@GetMapping("/report")
	public String process(@RequestParam("sno")int no,@RequestParam("sname") String name) {
	 System.out.println(no+"\n"+name);
	 return "show_report";
	}*/
	/*@GetMapping("/report")
	public String process(@RequestParam int sno, @RequestParam String sname) {
		System.out.println(sno + "\n" + sname);
		return "show_report";
	}*/
	/*@GetMapping("/report")
	public String process(@RequestParam int sno, @RequestParam(required = false) String sname) {
		System.out.println(sno + "\n" + sname);
		return "show_report";
	}*/
	/*	@GetMapping("/report")
	 * public String process(@RequestParam int sno, @RequestParam(defaultValue = "Subbarayu") String sname) {
		System.out.println(sno + "\n" + sname);
		return "show_report";
	}*/
	/*@GetMapping("/report")// multiple values 
	public String process(@RequestParam(name="sno",required = false)Integer sno, 
			@RequestParam("sname") String sname,
	         @RequestParam("sadd") String addrs[],
	         @RequestParam("sadd") List<String> saddList,
	         @RequestParam("sadd") Set<String> saddSet){
		System.out.println(sno + "\n" + sname+"\n" +Arrays.toString(addrs)+"\n" +saddList+ "\n" + saddSet);
		//return logical view 
		return "show_report";
	}*/
	@GetMapping("/report")//signle string passing multiple locations 
	public String process(@RequestParam(name="sno",required = false)Integer sno, 
			@RequestParam("sname") String sname,
	         @RequestParam("sadd") String addrs) {
		System.out.println(sno + "\n" + sname+"\n"+addrs);
		//return logical view 
		return "show_report";
	}
}
