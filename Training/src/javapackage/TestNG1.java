package javapackage;


import org.testng.annotations.*;

public class TestNG1 {
      @Test
     public void a2 () {
    	 System.out.println("a2 test method-6");
     }
      
      @BeforeTest
      public void b () {
     	 System.out.println("@BeforeTest method-2");
      } 
    
      @BeforeSuite
      public void c () {
     	 System.out.println("@BeforeTSuite method-1");
      } 
      
      @AfterMethod
      public void d () {
     	 System.out.println("@AfterMethod method-7");
      } 
      
      @BeforeClass
      public void e () {
     	 System.out.println("@BeforeClass method-3");
      } 
      
      @AfterTest
      public void f () {
     	 System.out.println("@AfterTest method-9");
      }
      
      @AfterClass
      public void g () {
     	 System.out.println("@AfterClass method-8");
      }
      
      public static void main(String[] args) {
		System.out.println("main method");
	}
      
      
      @BeforeMethod
      public void h () {
     	 System.out.println("@BeforeMethod method-4");
      }
      
      @AfterSuite
      public void i () {
     	 System.out.println("@AfterSuite method-10");
      }
      
      @Test
      public void a1() {
    	  System.out.println("a1 test method-5");
      }
	}


