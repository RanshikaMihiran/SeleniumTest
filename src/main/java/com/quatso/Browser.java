package com.quatso;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import net.bytebuddy.implementation.bytecode.ShiftRight;

public class Browser {
	
	public static WebDriver getBrowser(String browser){ {
		
		WebDriver driver = null;
		
		if (browser.equalsIgnoreCase("chrome")) {
			
			driver = new ChromeDriver();
			driver.get("http://www.google.com");
			
		}else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			driver.get("http://www.google.com");
		}
			
		else if (browser.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
			driver.get("http://www.google.com");
		}
			
		else
			System.out.println("Browser not supported" + browser);
			driver.manage().timeouts().pageLoadTimeout(120,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		return driver;

	}
		
	}

}
