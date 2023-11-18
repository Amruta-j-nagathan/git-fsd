package com.app.TestNGScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertDemo2 {
	@Test
	public void method1() {
		
		String expectedresult = "selenium";
		String actualresult = "seleniumTest";
		
		//assertNotEquals : it will check is 2 strings are not equal => true => pass
		//return false = test stops --> assertion error
		
		Assert.assertNotEquals(expectedresult, actualresult);
		
		
	}
	@Test
	public void method2() {
		String actualresult = null;
		Assert.assertNotNull(actualresult);
		//Assert.assertNull(actualresult);
	}
	@Test
	public void method3() {
		
		String actualresult = null;
		Assert.assertNull(actualresult);
	}
	
	
	
	

}
