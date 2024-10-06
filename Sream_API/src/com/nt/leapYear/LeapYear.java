package com.nt.leapYear;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the years which years will start");
		int year = s.nextInt();
		boolean isLeapyear = false;
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				
				if (year % 400 == 0) {
				}
				else {
	    			 isLeapyear=true;
	    		 }
			}else {
				isLeapyear=true;
			}
		}
		if(isLeapyear)
			System.out.print(year+"thi is leap years");
		else {
			System.out.print(year+":this is not leap years");
		}
	}//1.loop
}//main
