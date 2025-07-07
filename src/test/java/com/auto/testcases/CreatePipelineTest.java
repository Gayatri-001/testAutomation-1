package com.auto.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.auto.create.CreateCustomer;
import com.auto.create.CreatePipeline;
import com.auto.login.LoginPage;

public class CreatePipelineTest {
	CreatePipeline cpp;
	LoginPage lp;
	
	@BeforeMethod
	public void browserSetUp() {
		lp= new LoginPage();
		lp.initialization();
	}
	
	
	@Test
	public  void validateCreateNewDevPipeline() {
		cpp = new CreatePipeline();
		Assert.assertTrue(cpp.createNewPipeline());
	}

}
