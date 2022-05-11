package javapackage;

public class Inheritance3 {
	
	static int x =15;
	
	static  { System.out.println("static block");   }
	
	public static void m() {
		System.out.println("m method");
	}

	public static void main(String[] args) {
		System.out.println(x);
		m();

	}

}
