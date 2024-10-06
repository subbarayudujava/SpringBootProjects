package Blocks.nt;

public class Blocks {
   static int a=10;
	public static void main(String[] args) {
       System.out.println("main method");
       System.out.println(a);
	}
	static {
		System.out.println("static block");
		System.out.println(a);
	}

}
