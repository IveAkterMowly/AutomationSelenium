package com.ive.AutomationSelenium.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DriverManager {
	
	
		
	static { 
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ive Akter Mowly\\Desktop\\SeleniumFiles\\chromedriver.exe");
		
	}
      public static WebDriver driver = new ChromeDriver();
       
       
       public DriverManager()
       {
    	   
    	   
       }

}

