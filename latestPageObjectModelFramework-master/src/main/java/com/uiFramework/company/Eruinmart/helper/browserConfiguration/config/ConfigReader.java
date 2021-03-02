package com.uiFramework.company.Eruinmart.helper.browserConfiguration.config;

import com.uiFramework.company.Eruinmart.helper.browserConfiguration.BrowserType;

public interface ConfigReader {
	
	public int getImpliciteWait();
	public int getExplicitWait();
	public int getPageLoadTime();
	public BrowserType getBrowserType();
	public String getUrl();
	public String getUrl2();
	public String getUserName();
	public String getPassword();
    public String getnewEmail();
    public String getnewpassword();
    public String getconfirmpassword();
}
