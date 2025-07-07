package com.auto.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.auto.create.CreateAgent;
import com.auto.login.LoginPage;

public class CreateAgentTest {
	
	CreateAgent ca;
	LoginPage lp;
	
	@BeforeMethod
	public void browserSetUp() {
		lp= new LoginPage();
		lp.initialization();
	}
	
	
	@Test
	public  void validateCreateAgent() {
		ca = new CreateAgent();
		Assert.assertTrue(ca.createAgent());
	}

}
