package javapackage;

public class Array5 {

	public static void main(String[] args) {
		int a[][] = { {0,1,2} , {3,4,5} , {6,7,8} } ; 
		int row = a.length;   
		System.out.println(row);

		int coloumn = a[0].length;
		System.out.println(coloumn);   
		
		System.out.println();
		//method1
		for (int i [] :a) {
			for (int j : i) {
				System.out.print(j+"  ");
			}
			System.out.println();
		}
   
		System.out.println();
		//method2
		for ( int i =0; i<row ; i++)  {
			for (int j=0 ; j<coloumn ; j++)  {
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
	}

}
