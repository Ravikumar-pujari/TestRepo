package javapackage2;

import javapackage.Access_specifier2;

public class Access_specifier3 extends Access_specifier2 {

	public static void main(String[] args) {
		Access_specifier2 z = new Access_specifier2();
//		 System.out.println(z.a);
//        System.out.println(z.b);
//        System.out.println(z.c);
        System.out.println(z.d);
        
        Access_specifier3 z1 = new Access_specifier3();
        System.out.println(z1.c);

	}

}
