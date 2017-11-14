package com.test.automation.ffs.uiActions;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {
	
	public static final Logger log = Logger.getLogger(Dashboard.class.getName());

	
	WebDriver driver ;
	//test1234
	
   WebElement  xpathof_Grapefruit ; 

	
	
	

	public Dashboard (WebDriver driver) 
	{
		PageFactory.initElements(driver, this);	
	}


public void scrollandclickongrapefruits() {
	
	xpathof_Grapefruit.click();
		log.info("picking the xpath of grapefruit and clicking on grapefruits ");
	
		
	}




}


