package javapackage;

public class Staticflow {
//	static int i =5;
//	static { i=10;
//	       System.out.println(i);
//	       m2();
//	}
//
//	public static void m2() {
//		System.out.println(j);
//		System.out.println(i);
//		System.out.println(i+j);
//	}
//	
//	static { System.out.println("SBR");  }
//	
//	public static void main(String[] args) {
//	System.out.println("main starts");
//	m2();
//	System.out.println("main ends");
//	}
//     static int j = 25;
	
	   static int i=10;
	   
	   static {   System.out.println(i);}
	   public static void m1()  {
	              System.out.println(j);
	              System.out.println(i+j);
	           }
	   public static void main(String[] args) {
		System.out.println("start");
		System.out.println("end");
		m1();
	}
	   static int j=20;
}
