package TestNGDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
			System.out.println("System property: " + System.getProperty("user.dir"));
			String path=System.getProperty("user.dir") + ".\\src\\test\\resources\\config.properties";
			FileInputStream fis= new FileInputStream(path);
			Properties prop = new Properties();
			prop.load(fis);
			System.out.println(prop.getProperty("url"));
			System.out.println(prop.getProperty("token"));
			System.out.println(prop.getProperty("url_ui"));
			
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
