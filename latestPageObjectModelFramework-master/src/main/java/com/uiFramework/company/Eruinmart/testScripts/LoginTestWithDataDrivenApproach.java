package com.uiFramework.company.Eruinmart.testScripts;

import org.apache.log4j.Logger;
import org.testng.SkipException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.uiFramework.company.Eruinmart.helper.assertion.AssertionHelper;
import com.uiFramework.company.Eruinmart.helper.browserConfiguration.config.ObjectReader;
import com.uiFramework.company.Eruinmart.pageObject.LoginPage;
import com.uiFramework.company.Eruinmart.testbase.TestBase;


public class LoginTestWithDataDrivenApproach extends TestBase{
	private final Logger log = com.uiFramework.company.Eruinmart.helper.logger.LoggerHelper.getLogger(LoginTestWithDataDrivenApproach.class);
	
	LoginPage login;
	
	
	@DataProvider(name="testData")
	public Object[][] testData(){
		Object[][] data = getExcelData("testData.xlsx", "loginData");
		return data;
	}
	@BeforeClass
	public void beforeClass(){
		getApplicationUrl(ObjectReader.reader.getUrl());
		 login = new LoginPage(driver);
	}
	@Test(dataProvider="testData")
	public void loginTest(String userName, String password, String runMode) throws InterruptedException{
		
		if(runMode.equalsIgnoreCase("n")){
			throw new SkipException("Run mode for this set of data is marked N");
		}
		login.loginToApplication(userName, password);
		boolean status = login.verifySuccessLoginMsg();
		AssertionHelper.updateTestStatus(status);
		Thread.sleep(1000);
		getNavigationScreen(driver);
		login.logout();
	}
}
