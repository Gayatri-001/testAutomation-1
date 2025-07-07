package com.auto.create;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.auto.base.BaseClass;
import com.auto.login.LoginPage;

public class CreateAgent extends BaseClass {
	
	By agent = By.xpath("//p[text()='Agents']");
	By createNewAgent = By.xpath("//button[@class='_Button_13jvz_2 _Primary_13jvz_2 _Medium_13jvz_2 _Inline_13jvz_2']");
    By firstName = By.id("firstName");
    By lastName = By.id("lastName");
	By uniqueID = By.id("uniqueId");
	By saveAgent = By.xpath("//button[@class='_Button_13jvz_2 _Primary_13jvz_2 _Medium_13jvz_2 _Inline_13jvz_2 _SaveBtn_zsbi3_2']");
    By email = By.id("email");
    By phone = By.xpath("//input[contains(@class, '_Input_1t1nv_2 w-full pl-16')]");
    By profile = By.xpath("//button[@class='_ManageBtn_jb726_2']");
	
	public boolean createAgent() {
	
        LoginPage lp= new LoginPage();
        lp.login();
        driver.findElement(agent).click();
        driver.findElement(createNewAgent).click();
		// Create a timestamp string (e.g., "20250703_153205")
		String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());

		// Create a unique email
		String dynamicFname = "FirstAgent_" + timeStamp;
		String dynamicLname = "LastAgent_" + timeStamp;

		// Find the input field and send the dynamic value
		WebElement fName = driver.findElement(firstName);
		fName.sendKeys(dynamicFname); 
		
		WebElement lName = driver.findElement(lastName);
		lName.sendKeys(dynamicLname); 
		String uniqueID1 = dynamicFname + dynamicLname ;
		
		driver.findElement(email).sendKeys("top@email.com");
		
		driver.findElement(uniqueID).sendKeys(uniqueID1);
		driver.findElement(phone).sendKeys("1234567890");
		driver.findElement(saveAgent).click();
		
		return driver.findElement(profile).isDisplayed();
		
		
	}
	
}
