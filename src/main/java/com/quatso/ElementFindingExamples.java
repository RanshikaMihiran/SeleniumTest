package com.quatso;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementFindingExamples {
	
	public void findElementByName(String browser) {
		
		WebDriver driver  = Browser.getBrowser(browser);
		
		//open faceBook
		driver.get("https://www.facebook.com/");
		
		//Fin email webElement 
		
		
		WebElement emailElement = driver.findElement(By.name("email"));
		
		emailElement.sendKeys("authjor@gmail.com");
		
		
		
	}
	
	public void findElementById(String browser) {
		
		WebDriver driver  = Browser.getBrowser(browser);
		
		//open faceBook
		driver.get("https://www.facebook.com/");
		
		//Fin email webElement 
		
		
		WebElement emailElement = driver.findElement(By.id("pass"));
		
		emailElement.sendKeys("authjor@gmail.com");
		
		
		
	}
	
	public void findElementByXpath(String browser) {
		
		WebDriver driver  = Browser.getBrowser(browser);
		
		//open faceBook
		driver.get("https://www.facebook.com/");
		
		//Fin email webElement 
		
		
		WebElement emailElement = driver.findElement(By.xpath("//*[@name='email']"));
		
		emailElement.sendKeys("authjor@gmail.com");
		
		
		
	}
	
	
	

	
}
