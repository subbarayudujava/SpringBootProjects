package com.random;

public class Normal {
	public static void main(String[] args) {
		String str = "mam";

		StringBuffer sb = new StringBuffer();
		sb.append(str);
		String str2 = sb.reverse().toString();
		if (str.equals(str2)) {
			System.out.println("Palindrome");
		} //if
		else {
			System.out.println("Not a Palindrome");
		} //else
	}//main
}//class