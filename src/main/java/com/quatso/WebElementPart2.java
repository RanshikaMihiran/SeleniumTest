package com.quatso;

import org.openqa.selenium.WebDriver;

public class WebElementPart2 {
	
	public void openWebPageUsingNavigation(String browser) {
		
		WebDriver driver = Browser.getBrowser(browser);
		
		driver.navigate().to("https://www.facebook.com");
	}
	
	public void handleBackwordNavigation(String browser) {
		
		WebDriver driver = Browser.getBrowser(browser);
		
		driver.navigate().to("https://www.facebook.com");
		
		driver.navigate().to("https://www.w3schools.com/");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// navigation
		
		driver.navigate().back();
		
	}
	
	public void handleForwardNavigation(String browser) {
		
		WebDriver driver = Browser.getBrowser(browser);
		
		driver.navigate().to("https://www.facebook.com");
		
		driver.navigate().to("https://www.w3schools.com/");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// navigation
		
		driver.navigate().back();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.navigate().forward();
		
		
	}

}
