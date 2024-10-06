package arrays.nt;

import java.util.Scanner;

public class ArraysSubbu {

	public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the Strings");
      String sc=s.nextLine();
      int leng=sc.length();
      System.out.println("using the  to Strings");
      System.out.println(sc.toString());
      
      System.out.println("Length:"+leng);
      
      System.out.println("index of based on values");
		for(int i=0;i<leng;i++)
		{
		  char ch=sc.charAt(i);
		  System.out.println(ch+"");
		}
	      System.out.println("index of based on values");

      for(int i=leng-1;i>=0;i--) {
    	  char ch=sc.charAt(i);
    	  System.out.println(ch+" ");
      }
	}



}
