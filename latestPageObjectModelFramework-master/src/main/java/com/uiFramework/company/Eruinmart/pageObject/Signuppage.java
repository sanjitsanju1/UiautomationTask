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



public class Signuppage{
	
	private WebDriver driver;
	private final Logger log = LoggerHelper.getLogger(Signuppage.class);
	
	WaitHelper waitHelper;
	
	@FindBy(tagName = "input")
	WebElement Newusername;
	
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/home-page[1]/div[1]/div[2]/div[1]/vdezi-login-register[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[2]/div[1]/app-register[1]/div[1]/form[1]/mat-form-field[2]/div[1]/div[1]/div[1]/input[1]")
	WebElement Newpasswod;
	
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/home-page[1]/div[1]/div[2]/div[1]/vdezi-login-register[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[2]/div[1]/app-register[1]/div[1]/form[1]/mat-form-field[3]/div[1]/div[1]/div[1]/input[1]")
	WebElement Cpassword;
	
	@FindBy(xpath="//*[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin']")
	WebElement checkbox;
	
	@FindBy(xpath="//button[contains(text(),'Register')]")WebElement clickonRegister;
	
@FindBy(xpath="(//*[@class='ng-star-inserted'])[2]")WebElement clickonname ;

	public Signuppage(WebDriver driver) {
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
		this.Newusername.sendKeys(emailAddress);
	}
	
	public void enterPassword(String password){
		log.info("entering password...."+password);
		logExtentReport("entering password...."+password);
		this.Newpasswod.sendKeys(password);
	}
	public void enterconfirmPassword(String cpassword){
		log.info("entering password...."+cpassword);
		logExtentReport("entering password...."+cpassword);
		this.Cpassword.sendKeys(cpassword);
	}
	public void clickoncheckbox() {
		log.info("clickining on checkbox");
		this.checkbox.click();
	}
	public void clickOnRegisterButton() {
		this.clickonRegister.click();
	}
	
	public void logExtentReport(String s1){
		TestBase.test.log(Status.INFO, s1);
	}

}
