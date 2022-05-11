package javapackage;

public class Test7 {

//	int i;
//
//	Test7(int i) {
//		i = 2;
//	}
//
//	public static void main(String[] args) {
//
//		Test7 t = new Test7(7);
//		System.out.println(t.i);
//	}
	
	int x=10;
	
	Test7()     { System.out.println("NACR"); }
	Test7(int x){ System.out.println("ACR");  }
	            { System.out.println("NSBR"); }
	
	    public static void main(String[] args) {
		System.out.println("mms");
		Test7 t = new Test7();
		Test7 t1 = new Test7(10);
		System.out.println(t.x);
		System.out.println(t1.x);
        System.out.println("mme");		
	}
    }