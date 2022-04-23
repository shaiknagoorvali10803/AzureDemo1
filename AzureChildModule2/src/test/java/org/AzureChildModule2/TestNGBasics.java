package org.AzureChildModule2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGBasics {
	WebDriver driver;
		@Test
		public void test1() throws InterruptedException
		{
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
			BaseTest.setDriver(driver);
			BaseTest.getDriver().get("https://www.google.com/");
			System.out.println("test1");
			Thread.sleep(5000);
				
		}
		
		@Test
		public void test2() throws InterruptedException
		{
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
			BaseTest.setDriver(driver);
			BaseTest.getDriver().get("https://www.google.com/");
			System.out.println("test2");
			Thread.sleep(5000);
		}
		
		
		@AfterMethod
		
		public void teardown() {
			BaseTest.getDriver().close();
		}
		
		
	}
