package com.nt.subbu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class SpringBootAuthenticationAthoraisation1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAuthenticationAthoraisation1Application.class, args);
	}

}
