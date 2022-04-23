package org.AzureChildModule3;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGBasics {
	WebDriver driver;
	
	@BeforeClass
	public void SetUpSelect() throws IOException
	{
		System.out.println("step system property for chrome ");
		
		System.out.println("++++++++++++++++++++++++++++++");
		
		System.out.println("System property: " + System.getProperty("user.dir"));
		System.out.println("Environment passed from Jenkins " + System.getProperty("name"));
		
		System.out.println("++++++++++++++++++++++++++++++");
		
		//String path1=System.getProperty("user.dir") + File.separator+"/src/test/resources/config.properties";
		String path1="./src/test/resources/config.properties";
		FileInputStream fis1= new FileInputStream(path1);
		Properties prop1 = new Properties();
		prop1.load(fis1);
		System.out.println("values fetched using sinle slash and file separator:"+ prop1.getProperty("url"));
		System.out.println("values fetched using sinle slash and file separator:"+ prop1.getProperty("token"));
		System.out.println("values fetched using sinle slash and file separator:"+ prop1.getProperty("url_ui"));
		
		System.out.println("++++++++++++++++++++++++++++++");
		
	}
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
