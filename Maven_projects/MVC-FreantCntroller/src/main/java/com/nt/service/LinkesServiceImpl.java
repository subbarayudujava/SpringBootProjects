package com.nt.service;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class LinkesServiceImpl implements ILinkOparationContloller {
	@Override
	public String wishMessageGenerate() {
         LocalDateTime date= LocalDateTime.now();
         int hour=date.getHour();
         if(hour<12) {
        	 return"Good Morning";
         }else if(hour<16){
        	 return "good Aftenoon";
         }else if(hour<20) {
        	 return "Good Evening";
         }else {
        	 return"Good Night";
         }
	}

	@Override
	public Set<String> fechAllLanguages() {
		Locale locale[]=Locale.getAvailableLocales();
		Set<String> ob=new HashSet<String>();
		for(Locale i:locale) {
			ob.add(i.getDisplayLanguage());
		}
		return ob;
	}
}
