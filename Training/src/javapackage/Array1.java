package javapackage;

public class Array1 {

	public static void main(String[] args) {
		int a[] = new int[5];
		
		int length = a.length;
		System.out.println(length);
       
		for (int i=0; i<length; i++) {
			System.out.println(a[i]);
		}
		
		a[0] = 5;
		a[1] = 15;
		a[2] = 25;
		a[3] = 35;
		a[4] = 45;
		
		for (int i=0; i<length; i++) {
			System.out.println(a[i]);  }
		
		int a1[]= {10,20,30,40,50};
		
		for (int i=0; i<length; i++) {
			System.out.println(a1[i]);
		}
	}

}
