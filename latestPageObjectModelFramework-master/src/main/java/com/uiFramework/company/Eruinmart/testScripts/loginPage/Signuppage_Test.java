package com.uiFramework.company.Eruinmart.testScripts.loginPage;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

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
			/*boolean status = signup.verifySuccessLoginMsg();
		
		AssertionHelper.updateTestStatus(status);*/
	}
}
