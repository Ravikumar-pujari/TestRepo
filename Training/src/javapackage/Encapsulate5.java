package javapackage;

public class Encapsulate5 extends Encapsulate4{

	Encapsulate5(int registerNum, String Name) {
		super(registerNum, Name);
		
	}

	public static void main(String[] args) {
		Encapsulate5 e5 = new Encapsulate5(5, "ravi");
		System.out.println(e5.getNum());
		System.out.println(e5.getName());
		
		e5.set(5, "ravi");
		System.out.println(e5.getNum());
		System.out.println(e5.getName());

	}

}
