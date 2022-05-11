package javapackage;

public class Abstract2 extends Abstract1 {
	
	void m() {
		System.out.println("abstract");
	}

	public static void main(String[] args) {
		
		 Abstract2 a2 = new  Abstract2();
		 a2.m();
		 a2.a();
	}

}
