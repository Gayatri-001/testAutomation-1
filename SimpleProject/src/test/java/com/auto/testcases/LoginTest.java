package com.auto.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.auto.login.LoginPage;

public class LoginTest {
	
	LoginPage lp;
	
	@BeforeMethod
	public void browserSetUp() {
		lp=new LoginPage();
		lp.initialization();
	}

	@Test
	public void loginTest()  {
		Assert.assertTrue(lp.login());
	}
	
	@Test
	//public void signOutTest() {
		//lp.signOut();
	//}
	
	@AfterMethod
	public void closeBrowserSetUp() {
		//lp.tearDown();
	}
	
}
