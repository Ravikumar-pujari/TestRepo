package javapackage;

public class Inheritance6 extends Inheritance5 {
	
	public void check() {
//		Inheritance5 i5 = new Inheritance5();
//		i5.m3();
//		System.out.println(i5.x);
		m3();
		System.out.println(x);
	}

	public static void main(String[] args) {
		
		Inheritance6 i6 = new Inheritance6();
		i6.check();

	}

}
