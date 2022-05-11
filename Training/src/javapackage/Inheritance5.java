package javapackage;

public class Inheritance5 {

	int x = 20;
	
	{   System.out.println("non static block");     }
	
	public void m3() { System.out.println("m3 non static method");   }

	public static void main(String[] args) {
		Inheritance5 i5 = new Inheritance5();
		System.out.println(i5.x);
		i5.m3();

	}

}
