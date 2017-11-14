package com.test.automation.ffs.testbase;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testbase {
	public static final Logger log = Logger.getLogger(Testbase.class.getName());
	
	public WebDriver driver ;
	String Browser = "chrome" ; 
    String url = "http://www.freshfalsabzi.com/" ;
	
	public void init()
	{
		selectBrowser(Browser);
		getUrl(url);
		String log4jconfpath = "log4j.properties" ;
		PropertyConfigurator.configure(log4jconfpath);
	}
       
	public void selectBrowser(String Browser)
	{
		log.info("conditions to select browser");
		if(Browser.equalsIgnoreCase("chrome"))
		{
	    System.setProperty("webdriver.chrome.driver", "/Users/satwik/Documents/chromedriver");	
	    log.info("creating the object of "+Browser);
		driver = new ChromeDriver();
		}
			}
	public void getUrl(String url)
	{
		driver.get(url);
		log.info("maximizing the browser");
		driver.manage().window().maximize();
	}

}
