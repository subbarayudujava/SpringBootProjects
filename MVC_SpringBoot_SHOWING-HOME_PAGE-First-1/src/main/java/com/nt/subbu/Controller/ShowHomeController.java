package com.nt.subbu.Controller;

import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class ShowHomeController {
	/*@RequestMapping("/home")
	  public String showHome() {
		  return"welcome";
	  }*/
	/*@RequestMapping("/process")
	 public String lanchHomePage(Map<String, Object> map) {
		 System.out.println("Show home Controller::lanch HomePage:Shared memory object "+map.getClass());
		 map.put("Subbarayudu","val1" );
		 map.put("sysDt", LocalDateTime.now());
		 return "show_data";
	 }*/
	@Autowired
	private ServletContext sc;
	@Autowired
	private ServletConfig scg;
	
	/*@RequestMapping("/process")
	 public String lanchHomePage(Map<String, Object> map) {
		 System.out.println("Show home Controller::lanch HomePage:Shared memory object "+map.getClass());
		 System.out.println("Web Appication context:"+sc.getContextPath());
		 System.out.println("DisPatch Sevlet logic name:"+scg.getServletName());
		 map.put("Subbarayudu","val1" );
		 map.put("sysDt", LocalDateTime.now());
		 return "show_data";
	 }*/
	@RequestMapping("/process")
	 public void lanchHomePage(HttpServletResponse hsr) throws Exception{
		PrintWriter pw=hsr.getWriter();
		hsr.setContentType("Text/html");
		pw.println("<b>Directly from handil method</d>");
		 return ;
	 }
}
