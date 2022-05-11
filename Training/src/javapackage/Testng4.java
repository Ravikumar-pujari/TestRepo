package javapackage;

import org.testng.annotations.Test;

public class Testng4 {
	@Test(dependsOnMethods = {"z"})
	public void a() {
		System.out.println("a");
	}
	
	@Test()
	public void z() {
		System.out.println("z");
	}

}
