package com.tatadms;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {
	
	private static final int FILE = 0;

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		
		WebElement todaysdeal = driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]"));
		
		todaysdeal.click();
						
		WebElement eleh = driver.findElement(By.xpath("//img[@alt='Up to 16% off Samsung Watch 4 and Watch 4 Classic']"));
		
		eleh.click();
		
		Thread.sleep(3000);
		
		WebElement watch = driver.findElement(By.xpath("(//div[@class='a-section octopus-dlp-image-shield'])[3]"));
		
		watch.click();
		
		
		WebElement zoom = driver.findElement(By.xpath("//input[@aria-labelledby='a-autoid-5-announce']"));
		
		zoom.click();
		
		TakesScreenshot s = (TakesScreenshot) driver;
		
		File source = s.getScreenshotAs(OutputType.FILE);
		
		File desti = new File("C:\\Users\\PREM KUMAR\\eclipse-workspace\\Selenium\\SS\\watch.png");
		
		FileUtils.copyFile(source, desti);
		
		
				
		
		
		
		
		
		
		
		
	}

}
