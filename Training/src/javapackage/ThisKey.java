package javapackage;

public class ThisKey {
     int a=2;
     public void m() {
    	int a=1;
    	 System.out.println(a);
    	 System.out.println(this.a);
     }
	public static void main(String[] args) {
		ThisKey t = new ThisKey();
		t.m();	
	}
}
