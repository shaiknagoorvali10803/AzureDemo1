package org.AzureChildModule2;

import org.openqa.selenium.WebDriver;

public class BaseTest {
		public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
		
		public static WebDriver getDriver() {
			return driver.get();
		}
		
		public static void setDriver(WebDriver driverparm) {
			driver.set(driverparm);
		}

}

