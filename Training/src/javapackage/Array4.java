package javapackage;

public class Array4 {

	public static void main(String[] args) {
//		int a[] = {0,1,2,3};
//		for (int b : a) {
//			System.out.println(b);
//		}
		
		int a[][] = { {0,1,2} , {3,4,5} , {6,7,8} };
		for (int  i[] : a) {
			for (int j:i) {
			System.out.print(j+"  ");
			                          } 
			System.out.println();
		}

	}

}
