package javapackage;

public class Static1 {
	static int z =5;

	public static void a() {
//		  z=10;
		System.out.println(z);
		System.out.println(Static1.z);
	}
	
	public void b() {
//		z=15;
		System.out.println(z);
		System.out.println(Static1.z);
	}

	public static void main(String[] args) {
		a();
		System.out.println(Static1.z);
		Static1 st =new Static1();
		st.b();
		System.out.println(Static1.z);
	}

}
