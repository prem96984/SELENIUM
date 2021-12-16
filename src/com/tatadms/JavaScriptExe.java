package com.tatadms;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExe {

public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scroll(0,2000)", "");
		
		Thread.sleep(3000);
		
		js.executeScript("window.scroll(0,-2000)", "");
		
		WebElement deals = driver.findElement(By.xpath("//img[@alt='Deals & Promotions']"));		
		
		js.executeScript("arguments[0].click();", deals);
		
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.facebook.com/");
		
		WebElement click = driver.findElement(By.xpath("//button[@value='1']"));
		
		js.executeScript("document.getElementById('email').setAttribute('value','@123')");
		
		js.executeScript("document.getElementById('pass').value='prem';");
				
		//js.executeScript("arguements[0].click();", click);
		
		
		
		
		
		
		
		
	}
	
	
}
