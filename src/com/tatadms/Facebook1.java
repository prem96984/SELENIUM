package com.tatadms;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class Facebook1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PREM KUMAR\\eclipse-workspace\\Selenium\\Driver1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		String title = driver.getTitle();
		System.out.println("Title of the page is : " +title);
		
		WebElement logindata = driver.findElement(By.id("email"));
		
		boolean enabled = logindata.isEnabled();
		System.out.println("Enabled : " +enabled);
		
		boolean display = logindata.isDisplayed();
		System.out.println("Displayed : " +logindata.getText());
		
	    
		logindata.sendKeys("@123");
		
		Thread.sleep(3000);
		
		
		String attribute = logindata.getAttribute("value");
	    System.out.println("Attribute : "+attribute);
		
		
		String text = logindata.getText();
		System.out.println("Email ID : "+text);
		
		WebElement passw = driver.findElement(By.name("pass"));
		
		passw.sendKeys("pjdsf");
		
		Thread.sleep(3000);
		
		passw.clear();
		
		WebElement butt = driver.findElement(By.name("login"));
		
		butt.click();
		
		
	}

}
