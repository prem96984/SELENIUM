package com.tatadms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_Xpath {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		
		driver.findElement(By.xpath("//*[@id='pageContent']/div[3]/div[2]/div/div/div[2]/div/div[2]/a/div/img")).click();
		
		//driver.findElement(By.xpath("//div[@id='search']/div/div/div/span[3]/div[2]/div[2]/div/span/div/div/div/div/div[2]/div/div/div/span/a/div/img")).click();
				
	}

}
