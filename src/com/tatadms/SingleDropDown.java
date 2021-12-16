package com.tatadms;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleDropDown {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		driver.manage().window().maximize();
		
		//SelectbByIndex
		
		WebElement singledrpdwn = driver.findElement(By.xpath("//select[@id='dropdown1']"));
		
		Select s = new Select(singledrpdwn);
		
		Thread.sleep(3000);
				
		s.selectByIndex(4);
		
		Thread.sleep(3000);
		
		//selectByValue
		
		WebElement singldrpdwn2 = driver.findElement(By.xpath("//select[@id='dropdown3']"));
		
		Select s1 = new Select(singldrpdwn2);
		
		s1.selectByValue("3");
		
		Thread.sleep(3000);
		
		//SelectByVisibleText
		
		WebElement singldrpdwn3 = driver.findElement(By.xpath("//select[@name='dropdown2']"));
		
		Select s2 = new Select(singldrpdwn3);
		
		s2.selectByVisibleText("Appium");
		
		Thread.sleep(3000);
		
		TakesScreenshot e = (TakesScreenshot) driver;
		
		File source = e.getScreenshotAs(OutputType.FILE);
		
		File desti = new File("C:\\Users\\PREM KUMAR\\eclipse-workspace\\Selenium\\SS\\sidrpdwn.png");
		
		FileUtils.copyFile(source,desti);
		
		//getoptions
		
		
		List<WebElement> options = s.getOptions();
		
		int size = options.size();
		
		System.out.println("Size of Dropdown : "+size);
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}
