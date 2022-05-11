package javapackage;

public class Array6 {

	public static void passArray(int a[]) {
		int b = a[0];
//	System.out.println(b);	
	for (int i=0; i<a.length; i++)  {
		if (b>=a[i]) {
			System.out.println(b);
		}
		else {System.out.println("out"); }
	}
		
		
	}
	public static void main(String[] args) {
		int c[] = {22,2,44,5};
		
		passArray(c);

	}

}
