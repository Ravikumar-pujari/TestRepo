package javapackage;

import net.bytebuddy.implementation.MethodAccessorFactory;

public class Static {
//	static int x=50;
//
//	public static void main(String[] args) {
//		System.out.println(x);	}
//	static { 
//		 x=100; 
//		 }
	
//	int x=10;
//	 static {  x = 100;  }
	
//	int x = 50;
//	{
//		System.out.println("A");
//		System.out.println("a");
//	}
//	public static void main(String[] args) {
//		System.out.println("MMS");
//		Static s =new Static();
//		Static s1 =new Static();
//		
//		System.out.println("MME");	
//	}
//	static {
//		System.out.println("B");
//	}
//	int x = 50;
//	{System.out.println("A");  }
//	public static void main(String[] args) {
//		System.out.println("start");
//		Static s2 = new Static();
//		System.out.println("end");
//	}
//	{  System.out.println("B");  }
	
	int x = 50;
	static int y = 10;
	{    System.out.println("A");    
//	    {   x=100;
//	         y=20;   }
	} 
	public static void main(String[] args) {
		System.out.println("start");
		Static s2 = new Static();
		System.out.println(s2.x);
		System.out.println(y);
	}
}
