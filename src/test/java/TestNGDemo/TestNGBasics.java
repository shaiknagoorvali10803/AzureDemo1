package TestNGDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {

		@BeforeSuite
		public void SetUpSelect() throws IOException
		{
			System.out.println("step system property for chrome ");
			
			System.out.println("++++++++++++++++++++++++++++++");
			
			System.out.println("System property: " + System.getProperty("user.dir"));
			System.out.println("Environment passed from Jenkins " + System.getProperty("name"));
			
			String path=System.getProperty("user.dir") + ".\\src\\test\\resources\\config.properties";
			
			FileInputStream fis= new FileInputStream(path);
			Properties prop = new Properties();
			prop.load(fis);
			System.out.println("values fetched using double slash:"+prop.getProperty("url"));
			System.out.println("values fetched using double slash:"+prop.getProperty("token"));
			System.out.println("values fetched using double slash:"+prop.getProperty("url_ui"));
			
			System.out.println("++++++++++++++++++++++++++++++");
			
			String path1=System.getProperty("user.dir") + File.separator+"/src/test/resources/config.properties";
			
			FileInputStream fis1= new FileInputStream(path1);
			Properties prop1 = new Properties();
			prop1.load(fis1);
			System.out.println("values fetched using sinle slash and file separator:"+ prop1.getProperty("url"));
			System.out.println("values fetched using sinle slash and file separator:"+ prop1.getProperty("token"));
			System.out.println("values fetched using sinle slash and file separator:"+ prop1.getProperty("url_ui"));
			
			System.out.println("++++++++++++++++++++++++++++++");
			
		}
	
		@BeforeTest
		public void lunchBrowser()
		{
			System.out.println("lunch chrome browser");
		}
		
		@BeforeClass
		public void enterURL()
		{
			System.out.println("enterURL");
		}
		
		
		@BeforeMethod
		public void login()
		{
			System.out.println("login");
		}
			

		@Test
		public void test1()
		{
			System.out.println("test1");
		}
		
		@Test
		public void test2()
		{
			System.out.println("test2");
		}
		
		@AfterMethod
		public void logout()
		{
			System.out.println("logout from the app");
		}
		
		@AfterClass
		public void closeBrowser()
		{
			System.out.println("close the chrome browser");
		}
		
		@AfterTest
		public void deleteAllCookies()
		{
			System.out.println("delete All cookies");
		}
			
		
		@AfterSuite
		public void generateReport()
		{
			System.out.println("Generate test report");
		}

}
