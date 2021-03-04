package com.uiFramework.company.Eruinmart.testScripts;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.uiFramework.company.Eruinmart.helper.assertion.AssertionHelper;
import com.uiFramework.company.Eruinmart.helper.browserConfiguration.config.ObjectReader;
import com.uiFramework.company.Eruinmart.helper.logger.LoggerHelper;
import com.uiFramework.company.Eruinmart.pageObject.LoginPage;
import com.uiFramework.company.Eruinmart.testbase.TestBase;


public class LoginTest extends TestBase{
	private final Logger log = LoggerHelper.getLogger(LoginTest.class);
	
	@Test(description="Login test with valid credentials")
	public void testLoginToApplication(){
		getApplicationUrl(ObjectReader.reader.getUrl());
		
		LoginPage login = new LoginPage(driver);
			login.loginToApplication(ObjectReader.reader.getnewEmail(), ObjectReader.reader.getnewpassword());
	
		/*
		 * Enter your phone number
		 * Enter your firstname
		 * enter your lastname
		 * 
		 * 
		 * */
			

			
			boolean Enterphonenumber=	driver.findElement(By.xpath("//*[@class='animatedform_title']")).isDisplayed();
			if(Enterphonenumber=true)
			{
			
		
				driver.findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys("9937930102");
				getNavigationScreen(driver);
				driver.findElement(By.xpath("//span[contains(text(),'Submit')]")).click();	
			}
			else {
				System.out.println("false");
			}
			boolean Enterfirstname=	driver.findElement(By.xpath("//*[@class='animatedform_title']")).isDisplayed();
			if(Enterfirstname=true)
			{
		
			driver.findElement(By.xpath("//input[@id='mat-input-1']")).sendKeys("samar");
			getNavigationScreen(driver);
			driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/user-home[1]/new-user[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/div[1]/div[3]/button[1]/span[1]")).click();	
			
			}
			else {
				System.out.println("false");
			}
			boolean Enterlastname=	driver.findElement(By.xpath("//*[@class='animatedform_title']")).isDisplayed();
			if(Enterlastname=true)
			{
			
			driver.findElement(By.xpath("//input[@id='mat-input-2']")).sendKeys("jena");
			getNavigationScreen(driver);
			driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/user-home[1]/new-user[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/div[1]/div[3]/button[1]/span[1]")).click();	
			
			}
			else {
				System.out.println("false");
			}
	boolean status = login.verifySuccessLoginMsg();
		
		AssertionHelper.updateTestStatus(status);
	}
}
