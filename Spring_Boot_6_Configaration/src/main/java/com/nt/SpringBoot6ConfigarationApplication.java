package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.sbeans.Employee;

@SpringBootApplication
public class SpringBoot6ConfigarationApplication {
	public static void main(String[] args) {
		ApplicationContext context=   SpringApplication.run(SpringBoot6ConfigarationApplication.class, args);
		Employee em=context.getBean("comp",Employee.class);
		System.out.print("Result:"+em);
	}

}
