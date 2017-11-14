package com.test.automation.ffs.uiActions;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.automation.ffs.testbase.Testbase;


public class Homepage {
	public static final Logger log = Logger.getLogger(Homepage.class.getName());

	
	WebDriver driver ;
	
	@FindBy(xpath="//*[@id='popup-continue']")
	WebElement popupContinue ; 

	@FindBy(xpath="//input[@id='input-email']")
	WebElement inputemail ;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement Inputpassword ;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement clicklogin ; 
	
	@FindBy(xpath="//*[@id='toggler-slideOneB']")
	WebElement FRESHARRIVALS ;
	
	

	public Homepage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);	
	}


public void Logintoapplication(String username, String pass) {
		popupContinue.click();
		log.info("clicked on continue");
		  inputemail.sendKeys(username);
		  log.info("Entered user name  " +username +" and the object is "+inputemail.toString());
		  Inputpassword.sendKeys(pass);
		  log.info("Entered user name  " +pass +" and the object is "+Inputpassword.toString());
          clicklogin.click();
          log.info("Clicked on login button");
		
	}




}
