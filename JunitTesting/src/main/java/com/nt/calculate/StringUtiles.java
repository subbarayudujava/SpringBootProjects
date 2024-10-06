package com.nt.calculate;

public class StringUtiles {
	
	public Integer stringToInt(String str) {

		if (str == null || str.trim().length() == 0) {
			throw new IllegalArgumentException("input is null ot emty");
		}
		return Integer.parseInt(str);
	}
}
