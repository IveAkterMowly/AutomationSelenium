package com.ive.AutomationSelenium.Test;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.testng.annotations.Test;

import com.ive.AutomationSelenium.Utils.DriverManager;
import com.ive.AutomationSelenium.Utils.UrlTextUtils;
import com.ive.AutomationSelenium.Utils.UrlTextUtils.URL;
import com.ive.AutomationSelenium.Utils.XpathUtils;
import com.ive.AutomationSelenium.Utils.XpathUtils.LoginModule;

public class LoginTest {
	
	private WebDriver driver= null;
	@Test
	public void CheckLoginPageTitle()
	{
		driver= DriverManager.driver;
		driver.get(UrlTextUtils.URL.Base_URL);
		
		assertEquals(driver.getTitle(),UrlTextUtils.TEXT.HomePageTitle);
		System.out.println("Login Page Title Verified!");
	}
	@Test(dependsOnMethods = "CheckLoginPageTitle" )
	public void Logintest()
	{
 		driver.findElement(By.id(XpathUtils.LoginModule.UserName)).sendKeys("Admin");
 		driver.findElement(By.id(XpathUtils.LoginModule.PassWord)).sendKeys("admin123");
 		driver.findElement(By.id(XpathUtils.LoginModule.LoginBTN)).click();
 		System.out.println("Successfully Loged in!");
	}
	

}
