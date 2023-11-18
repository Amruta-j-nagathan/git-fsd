package com.app.TestNGScripts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterMethodAnnotation {
	
	@BeforeMethod
	public void  login() {
		System.out.println("open the browser");
		System.out.println("Login into gmail");
	}
	@Test(priority='1')
	public void composeEmail() {
		
		System.out.println("steps compose the email,");
	}
	@Test(priority='2')
	public void searchEmail() {
		System.out.println("steps to search the emails");
	}
	@Test(priority='3')
	public void deleteEmail() {
		System.out.println("steps to delete the email");
	}
	@AfterMethod
	public void logout() {
		System.out.println("ogout the browser");
		System.out.println("close the browser");
	}

	
	
	
	
}
