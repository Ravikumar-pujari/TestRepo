package javapackage;

public class Construct {
	
	int x =10;
	Construct()      { System.out.println("non arg");   }
	Construct(int x) { System.out.println("arg");       }
	                 { System.out.println("non static");}

	public static void main(String[] args) {
		System.out.println("main method");
		Construct t1 = new Construct(10) ;
		Construct t = new Construct() ;
	
		System.out.println(t.x);
		System.out.println(t1.x);
		System.out.println("main end");

	}

}
