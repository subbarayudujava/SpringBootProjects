package com.nt.Bean.wish;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WishMessageGenerate {
	@Autowired
	private LocalDateTime ldt;

	public WishMessageGenerate() {
		System.out.println("WishMessageGenerate::0-paramconstractor");
	}

	public String showWishMeassage(String user) {
		int hour = ldt.getHour();
		if (hour < 12)
			return "Good morning" + user;
		else if (hour < 16)
			return "Goog Aftenoon" + user;
		else if (hour < 20)
			return "Good Evening" + user;
		else
			return "Good night" + user;
	}//method
}//main method
