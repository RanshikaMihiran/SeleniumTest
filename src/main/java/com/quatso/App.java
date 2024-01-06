package com.quatso;

import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		
		System.out.println("please enter browser of your choice : Firefox, chrome, safari :");
		Scanner scanner = new Scanner(System.in);
		String browser = scanner.next();
		
//		ElementFindingExamples examples = new ElementFindingExamples();
		
//		WebElemetnPart1  examples = new WebElemetnPart1();
		
//		WebElementPart2 examples = new WebElementPart2();
		
//		WebTables examples = new WebTables();
		
		WebDriverWaits examples = new WebDriverWaits();
		
		if (browser.equalsIgnoreCase("firefox") || browser.equalsIgnoreCase("safari") || browser.equalsIgnoreCase("chrome")){
//			examples.findElementByName(browser);
//			examples.findElementById(browser);
//			examples.findElementByXpath(browser);
//			examples.handleIframe(browser);
//			examples.handleCheckbox(browser);
//			examples.handleRadioButton(browser);		
//			examples.handleAlerts(browser);	
//			examples.handleDropDown(browser);
			
//			examples.openWebPageUsingNavigation(browser);
			
//			examples.handleBackwordNavigation(browser);
			
//			examples.handleMultipleWindows(browser);
			
//			examples.getSingleElementFromWebTables(browser);
			
//			examples.getAllElementFromWebTables(browser);
			
//			examples.fluentWait(browser);
			
			examples.WebDriverWait(browser);
			
		}else {
			System.out.println("Browser" +browser+ "you enterd not supported");
		}
		
	}

}
 