package javapackage;

public class Encapsulate3 extends Encapsulate2   {

	public static void main(String[] args) {
		Encapsulate3 e =new Encapsulate3();
//		int x= e.getx();
//		System.out.println("before updation "+x);
		System.out.println("before updation "+e.getx());
		e.setx(450);
		int x1 = e.getx();
		System.out.println("after updation "+x1);

	}

}
