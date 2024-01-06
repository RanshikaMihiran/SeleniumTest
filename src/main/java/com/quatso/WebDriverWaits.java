package com.quatso;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import static jdk.internal.org.jline.utils.Colors.s;

public class WebDriverWaits {
	
	public void fluentWait(String browser) {
		
		WebDriver driver = Browser.getBrowser(browser);
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		
		driver.switchTo().frame("iframeResult");
		
		Wait wait = new FluentWait(driver).withTimeout(Duration.ofMillis(5000)).pollingEvery(Duration.ofMillis(500))
				.ignoring(NoSuchFieldException.class);
		
		wait.until(new Function<WebDriver, WebElement>() {
			
			public WebElement apply(WebDriver driver) {
				WebElement element = driver.findElement(By.tagName("button"));
				return  element;
			}
			
		});	
		
		driver.findElement(By.tagName("button")).click();
		driver.switchTo().alert().accept();
		
		
	}
	
	
	public void WebDriverWait(String browser) {
		
		WebDriver driver = Browser.getBrowser(browser);
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.tagName("button")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		wait.until(ExpectedConditions.alertIsPresent());
		
		driver.switchTo().alert().accept();
		
		
	}
	
	
	

}
