package javapackage;

public class Array7 {

	public static void main(String[] args) {
		int a[][] = { {1,2} ,{8,9} };
		int row = a.length;
		System.out.println(row);
		int coloumn =a[0].length;
		System.out.println(coloumn);
		
		for (int b[] : a) {
			for (int c:b) {
				System.out.println(c+"  ");	 
			}
		}
		
		for ( int i=0; i<row; i++) {
			for (int j=0; j<coloumn; j++) {
				System.out.print(a[i][j]+" ");	
			}
			System.out.println();
		}
	}

}
