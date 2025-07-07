package com.auto.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.auto.create.CreateAgent;
import com.auto.create.CreateCustomer;
import com.auto.login.LoginPage;

public class CreateCustomerTest {
	
	CreateCustomer ca;
	LoginPage lp;
	
	@BeforeMethod
	public void browserSetUp() {
		lp= new LoginPage();
		lp.initialization();
	}
	
	
	@Test
	public  void validateCreateCustomer() {
		ca = new CreateCustomer();
		Assert.assertTrue(ca.createNewCustomer());
	}

}
