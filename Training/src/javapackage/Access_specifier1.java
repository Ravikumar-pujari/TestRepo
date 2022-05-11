package javapackage;

public class Access_specifier1 {
	private int a = 1;
	         int b =2;
	protected int c=3;
	public int d = 4;

	public static void main(String[] args) {
		
		Access_specifier1 z =new Access_specifier1();
		
          System.out.println(z.a);
          System.out.println(z.b);
          System.out.println(z.c);
          System.out.println(z.d);
	}

}
