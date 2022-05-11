package javapackage;

public class Exception2 {
	
	public static void check(int age) {
		if (age<18) {
			throw new ArithmeticException("not eligible");   }
			else {
				System.out.println("eligible");
			}
		
	}

	public static void main(String[] args) {
		check(19);
		check(19);
         
	}

}
