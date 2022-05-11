package javapackage;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNG2 {
	private Exception SkipException;

	@Test(priority = -20)
	public void a3() {
		
		System.out.println("-20 a3 method");
	}
	
	@Test(priority = -10)
	public void z() {
		
		System.out.println("-10 z method");
	}
	
	@Test(priority = 0)
	public void ab() {
		
		System.out.println(" 0 ab method");
	}
	
	@Test(priority = 1)
	public void a() {
		
		System.out.println("1 a method");
	}
	@Test
	   public void b2() {
			
			System.out.println("b2 method");
			throw new SkipException("skipped b2");
//			System.out.println("unreachble code");
		}
	
	@Test(enabled = false)
	public void a1() {
		
		System.out.println("a1 method");
	}
	
	@Test(invocationCount = 2, priority=-30, enabled = false)
	public void a2() {
		
		System.out.println("a2 method");
	}
	


}
