package com.auto.login;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.math3.stat.descriptive.moment.Mean;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.auto.base.BaseClass;

public class LoginPage extends BaseClass{

	By signIn = By.xpath("//button[contains(text(),'Sign in with Microsoft')]");
	By email = By.name("loginfmt");
	By next = By.xpath("//*[@id=\"idSIButton9\"]");
	By next1= By.xpath("//*[@id=\"view\"]/div/div[5]/button");
	By no = By.xpath("//button[contains(text(),'No')]");
	By pwdField= By.name("passwd");
	By Db= By.xpath("//h3[text()='Dashboard']");

	public boolean login() {

		driver.findElement(signIn).click();
		driver.findElement(email).sendKeys(prop.getProperty("email"));
		driver.findElement(next).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		// 3. Wait until the element is clickable, then click it
		WebElement continueButton = wait.until(ExpectedConditions.visibilityOfElementLocated(pwdField));
		continueButton.sendKeys(prop.getProperty("password"));
		//elementToBeClickable()` is the best choice because it checks that the element is both visible and enabled.
		driver.findElement(next1).click();
		driver.findElement(no).click();
		
		return driver.findElement(Db).isDisplayed();
	}

	//public void signOut() {
		//login();
		//driver.findElement(menuOptions).click();
		//driver.findElement(signOut).click();
	//}

}
