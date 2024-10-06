package com.nt.Bean;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nt.Bean.wish.WishMessageGenerate;

@SpringBootApplication
public class SpringBootWIishMassage1Application {
	@Bean("idt")
	public LocalDateTime createLDT() {
		System.out.println("SpringBootWIishMassage1Application.createLDT()");
		return LocalDateTime.now();
	}

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootWIishMassage1Application.class, args);
		WishMessageGenerate generate = context.getBean("wishMessageGenerate", WishMessageGenerate.class);
		String result = generate.showWishMeassage("praset time");
		System.out.println("Subbarayudu:"+result);
		((ConfigurableApplicationContext) context).close();
	}

}
