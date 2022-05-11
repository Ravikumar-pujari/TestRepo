package javapackage;

public class Array3 {
	
	public static void method(int a[]) {
		
		int b =a[0];    //3
		int len = a.length;
		System.out.println(len);
		for (int i =0; i<len ; i++)  {
			if (b>=a[i]) {
				System.out.println(a[i]);
			}
			else {  System.out.println("abcd"); }
		}
	}

	public static void main(String[] args) {
		int b[] = { 3,1,2,3,4};
       method(b);
	}

}
