package com.test.automation.ffs.dashboardpage;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.test.automation.ffs.homepage.TC001_verifylogincredentials;
import com.test.automation.ffs.uiActions.Dashboard;
import com.test.automation.ffs.uiActions.Homepage;

public class ScrollDownandSelectitem  extends TC001_verifylogincredentials
{
	public static final Logger log = Logger.getLogger(ScrollDownandSelectitem.class.getName());

  Dashboard dashboard ; 


	@Test
	public void scrolldown()
	{
		log.info("scrolling the page down to fresh arrivals and clicking on grapefruits");
		
		  dashboard = new Dashboard(driver);
		  dashboard.scrollandclickongrapefruits();
		log.info("clicked on grapefruits");
		
	//Select dropdown = new Select(driver.findElement(By.id("identifier")));
//dropdown.selectByVisibleText("Programmer ");

	
	}
	
	
	
/**	@AfterTest
	public void endtest(){
		driver.close();
	}*/

}
