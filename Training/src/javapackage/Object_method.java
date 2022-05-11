package javapackage;

public class Object_method {
	int x=10;
	static int y=15;
    static	Object_method d = new Object_method();
	public static void add() {
		System.out.println("add running");
		
		System.out.println(d.x+y);
	}

	public static void main(String[] args) {
		add();
		
	}

}
