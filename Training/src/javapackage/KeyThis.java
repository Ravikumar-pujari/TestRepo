package javapackage;

public class KeyThis {
  int a = 10;
 
     void display() {
    	 int a=20;
    	 System.out.println(a);
    	 System.out.println(this.a);
     }
     
	public static void main(String[] args) {
		KeyThis k = new KeyThis();
		k.display();
        System.out.println(k.a);
	}

}
