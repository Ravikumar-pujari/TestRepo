package javapackage;

public class Static3 {
	
	public static void main(String[] args) {
	
       int a[] = new int[5];
        a[0] =1;
       int length = a.length;
       System.out.println(length);
       
       for (int i=0; i<length; i++) {
    	   System.out.println(a[i]);
       }
	}

}
