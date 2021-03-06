package com.uiFramework.company.Eruinmart.testScripts;

import java.util.Properties;
import java.util.regex.Pattern;

import javax.mail.Folder;
import javax.mail.Session;
import javax.mail.Store;

import org.apache.log4j.Logger;
import org.apache.tools.ant.taskdefs.email.Message;
import org.apache.tools.ant.types.CommandlineJava.SysProperties;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.google.inject.matcher.Matcher;
import com.uiFramework.company.Eruinmart.helper.assertion.AssertionHelper;
import com.uiFramework.company.Eruinmart.helper.browserConfiguration.config.ObjectReader;
import com.uiFramework.company.Eruinmart.helper.logger.LoggerHelper;
import com.uiFramework.company.Eruinmart.pageObject.LoginPage;
import com.uiFramework.company.Eruinmart.pageObject.Signuppage;
import com.uiFramework.company.Eruinmart.testbase.TestBase;


public class Signuppage_Test extends TestBase{
	private final Logger log = LoggerHelper.getLogger(Signuppage_Test.class);
	
	@Test(description="Signup page is creating")
	public void testLoginToApplication(){
		getApplicationUrl(ObjectReader.reader.getUrl2());
		
			Signuppage signup = new Signuppage(driver);
			signup.enterEmailAddress(ObjectReader.reader.getnewEmail());
	signup.enterPassword(ObjectReader.reader.getnewpassword());
	signup.enterconfirmPassword(ObjectReader.reader.getconfirmpassword());
	signup.clickoncheckbox();		
	signup.clickOnRegisterButton();	
	getNavigationScreen(driver);
/*
 * Then it is asking for otp ,go with manually and  put the otp
  and verify bcozw selenium can't handle otp
 *The rest enter phone number ,first name and lastname code you will find in logintest.java
 */
	}
}
