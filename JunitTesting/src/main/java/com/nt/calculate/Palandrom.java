package com.nt.calculate;

public class Palandrom {
     public boolean isPalandrom(String str) {
    	 String reverse="";
    	 int length=str.length();
    	 for(int i=length-1;i>=0;i--) {
    		 reverse = reverse + str.charAt(i);
    	 }//for
    	 if(str.equalsIgnoreCase(reverse)) {
    		 return true;
    	 }//if
    	 else {
    		 return false;
    	 }//else
     }//method
         
	}//class


