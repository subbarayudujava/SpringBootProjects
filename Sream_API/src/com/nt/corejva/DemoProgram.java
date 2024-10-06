package com.nt.corejva;

import java.util.Scanner;

public class DemoProgram {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      System.out.print("Enter the Id");
      int id=Integer.parseInt(s.nextLine());
      System.out.print("Enter the name");
      String name=s.nextLine();
      System.out.print("Enter the code");
      String code=s.nextLine();
      System.out.println("=====Customer Details====");
      Pclass ob=new Pclass(id, name, code);
      System.out.println(ob.toString());
      s.close();
      }//main
}//class
