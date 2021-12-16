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

public class Frame2 {
	
		public static void main(String[] args) throws InterruptedException, IOException {
			
			WebDriver driver = new ChromeDriver();
			
			System.setProperty("webdriver,chrome.driver", System.getProperty("user.dir")+("\\Driver1\\chromedriver.exe"));
			
			driver.get("http://www.leafground.com/pages/frame.html");
			
			driver.manage().window().maximize();
			
			driver.switchTo().frame(0);
					
			WebElement findElement = driver.findElement(By.xpath("//button[@id='Click']"));
			
			findElement.click();
			
			String text = findElement.getText();
			
			System.out.println("Frane no : 1 = 2 "+text);
			
			driver.switchTo().defaultContent();
			
			driver.switchTo().frame(1);
								
			driver.switchTo().frame("frame2");
			
			WebElement findElement2 = driver.findElement(By.xpath("//button[@id='Click1']"));
			
			findElement2.click();
			
			String text2 = findElement2.getText();
			
			System.out.println("Frane no : 1 = " +text2);
			
			driver.switchTo().defaultContent();
			
			List<WebElement> no_of_frames = driver.findElements(By.tagName("iframe"));
			
			int size = no_of_frames.size();
			
			System.out.println("No of Frames : "+size);
			
			TakesScreenshot s = (TakesScreenshot) driver; //upcasting
			
			File source = s.getScreenshotAs(OutputType.FILE);
			
			File desti = new File("C:\\Users\\PREM KUMAR\\eclipse-workspace\\Selenium\\SS\\frame.png");
			
			FileUtils.copyFile(source,desti);
			
			Thread.sleep(3000);
			
			driver.quit();
		}
	
}
