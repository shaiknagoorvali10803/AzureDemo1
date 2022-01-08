package TestNGDemo;

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
		public void SetUpSelect()
		{
			System.out.println("step system property for chrome ");
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
