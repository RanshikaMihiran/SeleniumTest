package com.quatso;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
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
	
	
	public void handleMultipleWindows(String browser) {
		
		WebDriver driver = Browser.getBrowser(browser);
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_open");
		
		System.out.println("Parent title is " +driver.getTitle());
		
		driver.switchTo().frame("iframeResult");
		
		String parenWindowID =  driver.getWindowHandle();
		
		System.out.println("Parent window id is " +parenWindowID);
		
		//click over button
		
		driver.findElement(By.tagName("button")).click();
		
		Set<String> windIdSet =  driver.getWindowHandles();
		
		//covert to list
		
		List<String> windIdList = new ArrayList<String>(windIdSet);
		
		//Switch to the child Window
		
		driver.switchTo().window(windIdList.get(1));
		
		System.out.println("Child title is " +driver.getTitle());
		
		driver.switchTo().window(parenWindowID);
		
		System.out.println("Parent title is " +driver.getTitle());
		
		driver.manage().window().maximize();
		
		
		
	}
	
	

	
	

}
