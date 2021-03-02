package com.uiFramework.company.Eruinmart.testScripts.loginPage;

import org.apache.log4j.Logger;
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
		
	boolean status = login.verifySuccessLoginMsg();
		
		AssertionHelper.updateTestStatus(status);
	}
}
