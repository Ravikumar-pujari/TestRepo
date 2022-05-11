package javapackage;

public class Inheritance7 {

	      int x = 10;
	      
	      {      System.out.println("non-static block");     }
	      
	      Inheritance7(int x)
	      {
	    	  System.out.println("Inheritance7 constructor");
	      }
	      
	      public void m4()  {
	    	  System.out.println("m4 non static method");
	      }
	public static void main(String[] args) {
		Inheritance7 i7 = new Inheritance7(10);
          i7.m4();
          System.out.println(i7.x);
	}

}
