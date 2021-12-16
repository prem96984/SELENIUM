package com.tatadms;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_And_Robots1 {
	
	//todaysDeal and QuitClose task
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
					
        Robot r = new Robot();
        
        Actions m1 = new Actions(driver);
        
        WebElement reg = driver.findElement(By.xpath("//a[text()='Registry']"));
		
		m1.contextClick(reg).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
								
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);
		
		
		WebElement cutser = driver.findElement(By.xpath("//a[text()='Gift Cards']"));
					
		m1.click(cutser).build().perform();
		
		Thread.sleep(3000);
		
		driver.get("https://www.amazon.com/");
		
		Thread.sleep(3000);
		
		WebElement todaysdeal = driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]"));
						
		m1.click(todaysdeal).build().perform();
				
		Thread.sleep(3000);
		
		driver.quit();
		
		
	}

}
