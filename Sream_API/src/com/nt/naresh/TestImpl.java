package com.nt.naresh;

public class TestImpl {
	
	
	public static void main(String[] args) {
     
		ITest test= new ITest() {
			public Integer m1(int x) {
				System.out.println("anonymouse Inner class x:");
				return x;
			}
		};
		Integer m1 = test.m1(10);
		System.out.println(m1);
		
		ITest te=(x)->{
			System.out.println("Lambeda Expreations x:");
			return x;
		};
		Integer m12 = te.m1(20);
		System.out.println(m12);
	}//main
	
}//class
