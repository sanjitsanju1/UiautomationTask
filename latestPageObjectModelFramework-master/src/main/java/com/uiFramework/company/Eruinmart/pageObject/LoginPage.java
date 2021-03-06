package com.uiFramework.company.Eruinmart.pageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;
import com.uiFramework.company.Eruinmart.helper.assertion.VerificationHelper;
import com.uiFramework.company.Eruinmart.helper.browserConfiguration.config.ObjectReader;
import com.uiFramework.company.Eruinmart.helper.logger.LoggerHelper;
import com.uiFramework.company.Eruinmart.helper.wait.WaitHelper;
import com.uiFramework.company.Eruinmart.testbase.TestBase;



public class LoginPage{
	
	private WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(LoginPage.class);
	
	WaitHelper waitHelper;
	
	@FindBy(tagName = "input")
	WebElement username;
	
	@FindBy(xpath="//input[@id='mat-input-1']")
	WebElement password;
	
	@FindBy(xpath="//button[contains(text(),'Sign In')]")
	WebElement Signin;
	@FindBy(xpath="//button[@class='usermenu-btn mat-icon-button mat-button-base']")WebElement clickonname ;
	//@FindBy(xpath="((//*[@class='ng-star-inserted'])[2]")WebElement clickonname ;

@FindBy(xpath="//div[contains(text(),'Dashboard')]")
	WebElement successMsgObject;
	
	@FindBy(xpath="//span[contains(text(),'Logout')]")WebElement clickOnLogOut;
	

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
		//waitHelper.waitForElement(signin,ObjectReader.reader.getExplicitWait());
		new TestBase().getNavigationScreen(driver);
		TestBase.logExtentReport("Login Page Object Created");
	}
	
	
	
	public void enterEmailAddress(String emailAddress){
		log.info("entering email address...."+emailAddress);
		logExtentReport("entering email address...."+emailAddress);
		this.username.sendKeys(emailAddress);
	}
	
	public void enterPassword(String password){
		log.info("entering password...."+password);
		logExtentReport("entering password...."+password);
		this.password.sendKeys(password);
	}
	public void signin() {
		this.Signin.click();
	}
	
	
	
	public boolean verifySuccessLoginMsg(){
		return new VerificationHelper(driver).isDisplayed(successMsgObject);
	}
	
	
	
	public void loginToApplication(String emailAddress, String password){
		
		enterEmailAddress(emailAddress);
		enterPassword(password);
		signin();
	}
	public void logout() {
		this.clickonname.click();
		this.clickOnLogOut.click();
	}
	
	
	public void logExtentReport(String s1){
		TestBase.test.log(Status.INFO, s1);
	}

}
