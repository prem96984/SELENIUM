package com.tatadms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver1\\chromedriver.exe");
				
		WebDriver driver = new ChromeDriver();
		
		//Implicit or Global Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
				
		//Explicit or Local wait
		WebElement adevices = driver.findElement(By.xpath("(//a[@class='nav_a'])[5]"));
		
		WebDriverWait m = new WebDriverWait(driver, 20);
		
		m.until(ExpectedConditions.visibilityOf(adevices));
		
		//Fluent Wait or Frequency Of Interval
		
		
		org.openqa.selenium.support.ui.Wait<WebDriver> s = new FluentWait<WebDriver>(driver)
				.withTimeout(60, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
		
				
				
 		
		
	}

}
