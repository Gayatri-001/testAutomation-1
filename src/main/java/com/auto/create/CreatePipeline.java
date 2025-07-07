package com.auto.create;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.auto.base.BaseClass;
import com.auto.login.LoginPage;

public class CreatePipeline extends BaseClass {
	
	By pipeline = By.xpath("//p[text()='Pipelines']");
	By createNewPipeline = By.xpath("//button[@class='_Button_13jvz_2 _Primary_13jvz_2 _Medium_13jvz_2 _Inline_13jvz_2']");
    By devPipeline = By.xpath("//h6[text()='[development use only]']");
	By scratchPipeline = By.xpath("//button[@class='_Button_13jvz_2 _White_13jvz_2 _XLarge_13jvz_2 _Inline_13jvz_2 py-2.5 px-6 bg-white border border-gray-300']");
    By inputField = By.xpath("//*[@id=\"configure-stages\"]/div[1]/div/header/fieldset/input");
	By addBtn = By.xpath("//*[@id=\"configure-stages\"]/div[1]/div/main/section[4]/ul/li/button");
	By fnshAdding = By.xpath("//button[@class='_Button_13jvz_2 _Primary_13jvz_2 _Medium_13jvz_2 _Inline_13jvz_2']");
	By publishPp = By.xpath("//h5[span and contains(.,'Publish')]");
	By pPname = By.xpath("//input[@class='__Input _Input_1t1nv_2']");
	By publish = By.xpath("//button[.//span[contains(text(),'Publish')]]");
	By stage = By.id("blank");
	By continueBtn =  By.xpath(".//span[text()='Continue']");
	By saveCont = By.xpath(".//span[text()='Save & Continue']");
	By successPp = By.xpath("//h3[text()='Nice work, you published the pipeline!']");

	/*
	 * By firstName = By.id("firstName"); By lastName = By.id("lastName"); By
	 * uniqueID = By.id("uniqueId"); By email = By.id("email"); By phone =
	 * By.xpath("//input[contains(@class, '_Input_1t1nv_2 w-full pl-16')]");
	 */
    By profile = By.xpath("//button[@class='_ManageBtn_jb726_2']");

	public boolean createNewPipeline() {
		 LoginPage lp= new LoginPage();
		  lp.login();
		  
		  driver.findElement(pipeline).click();
	       driver.findElement(createNewPipeline).click();
	        driver.findElement(scratchPipeline).click();
	        driver.findElement(devPipeline);
	        
	       driver.findElement(inputField).sendKeys("development");
	       String timeStamp = new SimpleDateFormat("yyyyMMdd").format(new Date());
	     
	       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
           WebElement addButton = wait.until(ExpectedConditions.elementToBeClickable(addBtn));
           addButton.click();
           System.out.println("clicked");
          driver.findElement(fnshAdding).click();
         // WebElement continueBtn1 = wait.until(ExpectedConditions.visibilityOfElementLocated(continueBtn));
          //continueBtn1.click();
          WebElement saveBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(saveCont));
          saveBtn.click();

        // 1   driver.findElement(publishPp).click();
           
	     //li[contains(label, 'development use only')]
	       
           //WebElement title = wait.until(ExpectedConditions.visibilityOfElementLocated(stage));
   		 //  title.sendKeys(prop.getProperty("Test"+timeStamp));
          // driver.findElement(stage).click();
           
			
			  driver.findElement(publishPp).click();
			  driver.findElement(pPname).sendKeys("Test"+timeStamp);
			  
			  driver.findElement(publish).click();
			 
           
			  return driver.findElement(successPp).isDisplayed();
           
		  
	}
	
}
