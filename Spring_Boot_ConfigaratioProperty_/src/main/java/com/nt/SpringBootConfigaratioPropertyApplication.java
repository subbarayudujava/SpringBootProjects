package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Company;

@SpringBootApplication
public class SpringBootConfigaratioPropertyApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootConfigaratioPropertyApplication.class, args);
		Company company = context.getBean( Company.class);
		System.out.println("result:" + company);
		((ConfigurableApplicationContext) context).close();
	}

}
