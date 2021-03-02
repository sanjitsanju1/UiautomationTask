package com.uiFramework.company.Eruinmart.helper.browserConfiguration.config;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import com.uiFramework.company.Eruinmart.helper.browserConfiguration.BrowserType;
import com.uiFramework.company.Eruinmart.helper.resource.ResourceHelper;


public class PropertyReader implements ConfigReader {

	private static FileInputStream file;
	public static Properties OR;

	public PropertyReader() {
		try {
			String filePath = ResourceHelper.getResourcePath("src/main/resources/configfile/config.properties");
			file = new FileInputStream(new File(filePath));
			OR = new Properties();
			OR.load(file);
			
			String filePath1 = ResourceHelper.getResourcePath("src/main/resources/configfile/config1.properties");
			file = new FileInputStream(new File(filePath1));
			OR = new Properties();
			OR.load(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int getImpliciteWait() {
		return Integer.parseInt(OR.getProperty("implicitwait"));
	}

	public int getExplicitWait() {
		return Integer.parseInt(OR.getProperty("explicitwait"));
	}

	public int getPageLoadTime() {
		return Integer.parseInt(OR.getProperty("pageloadtime"));
	}

	public BrowserType getBrowserType() {
		return BrowserType.valueOf(OR.getProperty("browserType"));
	}

	public String getUrl() {
		if(System.getProperty("url1")!=null){
			return System.getProperty("url");
		}
		return OR.getProperty("applicationUrl1");
	}
	public String getUrl2() {
		if(System.getProperty("url2")!=null){
			return System.getProperty("url2");
		}
		return OR.getProperty("applicationUrl2");
	}

	public String getUserName() {
		if(System.getProperty("userName")!=null){
			return System.getProperty("userName");
		}
		return OR.getProperty("userName");
	}

	public String getnewEmail() {
		if(System.getProperty("Email")!=null){
			return System.getProperty("Email");
		}
		return OR.getProperty("Email");
	}
	public String getPassword() {
		if(System.getProperty("password")!=null){
			return System.getProperty("password");
		}
		return OR.getProperty("password");
	}
	public String getnewpassword() {
		if(System.getProperty("newpassword")!=null){
			return System.getProperty("newpassword");
		}
		return OR.getProperty("newpassword");
	}
	
	public String getconfirmpassword() {
		if(System.getProperty("cpassword")!=null){
			return System.getProperty("cpassword");
		}
		return OR.getProperty("cpassword");
	}

	
	
	
	


}



