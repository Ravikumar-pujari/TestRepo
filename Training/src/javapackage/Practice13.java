package javapackage;
import org.testng.SkipException;
import org.testng.annotations.*;

public class Practice13 {
	
	@Test(dependsOnMethods = "ab")
	public void a1() {
		System.out.println("@Test a1");
		
	}
	@Test
	public void ab() {
		System.out.println("@Test ab");
	}
	@AfterSuite
	public void c() {
		System.out.println("@AfterSuite");
	}
	@BeforeSuite
	public void d() {
		System.out.println("@BeforeSuite");
	}
	@AfterTest
	public void e() {
		System.out.println("@AfterTest");
	}
	@BeforeTest
	public void f() {
		System.out.println("@BeforeTest");
	}
	@AfterClass
	public void g() {
		System.out.println("@AfterClass");
	}
	@BeforeClass
	public void h() {
		System.out.println("@BeforeClass");
	}
	
	public static void main(String[] args) {
		System.out.println("main method");
	}
	@AfterMethod
	public void i() {
		System.out.println("@AfterMethod");
	}
	@BeforeMethod
	public void j() {
		System.out.println("@BeforeMethod");
	}
	
}
