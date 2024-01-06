package com.quatso;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebTables {
	
	public void getSingleElementFromWebTables(String browser) {
		
		WebDriver driver = Browser.getBrowser(browser);
		
		driver.get("https://www.timeanddate.com/worldclock/");
		
		String elemetText = driver.findElement(By.id("p79")).getText();
		
		System.out.println("text from the web table is "+elemetText);
		
		
	}
	
	public void getAllElementFromWebTables(String browser) {
		
		WebDriver driver = Browser.getBrowser(browser);
		
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_table_intro");
		
		driver.switchTo().frame("iframeResult");
		
		WebElement table  = driver.findElement(By.tagName("table"));
		
		//get All Rows
		
		List<WebElement> rowList = table.findElements(By.tagName("tr"));
		
		//run through each row and retreive data
		
		for (WebElement row : rowList) {
			List<WebElement> dataList = row.findElements(By.tagName("td"));
			for (WebElement data : dataList){
				System.out.print(data.getText() + "\t");
			}
			
			System.out.println();
		}
		
		
		
		
	}

}
