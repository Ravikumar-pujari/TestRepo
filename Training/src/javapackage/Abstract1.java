package javapackage;

public abstract class Abstract1 {

        Abstract1() {
        	System.out.println("CONSTRUCTOR");
        }
        
        {System.out.println("non static");}
        
        static   {System.out.println("static");}
        
        abstract void m();
        
        public void a() {
        System.out.println("non abstract");	
        }
}
