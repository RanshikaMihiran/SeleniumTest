package com.quatso;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebElemetnPart1 {
	
	public void handleIframe(String browser) {
		
		WebDriver driver1 = Browser.getBrowser(browser);
		
		driver1.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_files_absoulute");
		
		driver1.findElement(By.linkText("Using a Full URL File Path")).click();
		
	}
	
	
	
	public void handleCheckbox(String browser) {
		
		WebDriver driver = Browser.getBrowser(browser);
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_checkbox");
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.name("vehicle1")).click();
		
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.name("vehicle1")).click();
	}
	
	
	public void handleRadioButton(String browser) {
		
		WebDriver driver = Browser.getBrowser(browser);
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_radio");
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.cssSelector("input[value='HTML']")).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.cssSelector("input[value='JavaScript']")).click();
		
	}
	
	
	public void handleAlerts(String browser) {
		
		WebDriver driver = Browser.getBrowser(browser);
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.tagName("button")).click();
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println("Alert text is " +alert.getText());
		
		alert.accept();
		
	}

}
  