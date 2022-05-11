package javapackage;

public class TrainMaterial {

	public static void main(String[] args) {
		int i = 2;
		System.out.println(i);
		f1(1);

	}

	public static void f1(int i) {
		System.out.println(i);
		f2(i + 1); //1
	}

	public static void f2(int i) {
		System.out.println(i);
		f3(i + 2); //2
	}

	public static void f3(int i) {
		System.out.println(i + 3);   //4+3
	}

}


