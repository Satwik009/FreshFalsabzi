package com.test.automation.ffs.homepage;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.automation.ffs.testbase.Testbase;
import com.test.automation.ffs.uiActions.Homepage;

public class TC001_verifylogincredentials extends Testbase {
	
	public static final Logger log = Logger.getLogger(TC001_verifylogincredentials.class.getName());

	Homepage homepage;
	
	@BeforeTest   
	public void setup()
	     {
		init();
			}
	
	@Test
	public void verifylogincredentials(){
		log.info("===starting  TC001_verifylogincredentials Test===");
   homepage = new Homepage(driver)		;
   homepage.Logintoapplication("9452592854","123456");
   Assert.assertEquals(driver.findElement(By.xpath("//*[@id='toggler-slideOneB']")).getText(), "   FRESH ARRIVALS");
     log.info("===Ending TC001_verifylogincredentials Test===");
      	}
	
	

}
