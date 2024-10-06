package arrays.nt;

import java.util.Scanner;

public class Palandrom1 {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String ");
        String s=sc.nextLine();
        String s1="";
        for(int i=s.length()-1;i>=0;i--) {
        	s1=s1+s.charAt(i);
        }
        if(s.equalsIgnoreCase(s1)) {
        	System.out.println("This is palandrom String");
        }else {
        	System.out.println("This is not palandrom String");
        }
	}

}
