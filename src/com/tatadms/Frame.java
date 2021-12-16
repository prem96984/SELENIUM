package com.tatadms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver,chrome.driver", System.getProperty("user.dir")+("\\Driver1\\chromedriver.exe"));
		
		driver.get("http://www.leafground.com/pages/frame.html");
		
		//driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
				
		WebElement findElement = driver.findElement(By.xpath("//button[@id='Click']"));
		
		findElement.click();
		
		
		String text = findElement.getText();
		System.out.println("Did I Click???"+text);	
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
		
	}

}
