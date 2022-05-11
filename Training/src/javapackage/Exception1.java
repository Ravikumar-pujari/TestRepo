package javapackage;

public class Exception1 {

	public static void main(String[] args) {
		 String y = "selenium";
		 String x = "one";
		 try {
			int i = Integer.parseInt(x);
		} catch (NumberFormatException e) {
			e.printStackTrace();
//			System.out.println(e);
		}
		 System.out.println("handled");
		
		/*
		 * String s1 = "100"; String s2 = "100"; System.out.println(s1+s2);
		 * 
		 * int x1 = Integer.parseInt(s1); int x2 = Integer.parseInt(s2);
		 * System.out.println(x1+x2);
		 */

	}

}
