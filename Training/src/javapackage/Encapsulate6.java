package javapackage;

public class Encapsulate6 {
	
	private void m1() {
		System.out.println("AC off");
	}
	
	private static void m2() {
		System.out.println("AC on");
	}
	
	private int m3() {
		System.out.println("m2");
		return 100;
	}
	
	public void getm1() {
		m1();
	}
	
	public void getm2() {
		m2();
	}
	
	public int getm3() {
		return m3();
	}
	}


