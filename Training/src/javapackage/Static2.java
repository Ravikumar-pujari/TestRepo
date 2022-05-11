package javapackage;

public class Static2 {

	 int z =5;
//
//	public static void a() {
//		 
//		z=10;
//		System.out.println(z);
//	}
	
	public void b() {
		 z=15;
		System.out.println(z);
		
	}

	public static void main(String[] args) {
//		a();
//		System.out.println(Static2.z);
		Static2 st =new Static2();
		st.b();
//		System.out.println(Static2.z);
	}
	}


