package javapackage;

public class Nonstatic {
	int x=50;
	{
		System.out.println("A");
	}

	public static void main(String[] args) {
		System.out.println("mms");
		Nonstatic n =new Nonstatic();
		System.out.println("mme");
	}
	{
		System.out.println("B");
	}
	{
		System.out.println("C");
	}
}
