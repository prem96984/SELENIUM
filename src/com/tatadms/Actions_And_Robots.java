package com.tatadms;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_And_Robots {
	
	public static void main(String[] args) throws AWTException, IOException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize(
				);
		
		
		
		Actions mo = new Actions(driver);
		
		
		Robot kb = new Robot();
		
		
		WebElement abasics = driver.findElement(By.xpath("(//a[@data-csa-c-type='link'])[3]"));
		
		
		//contextclick
		
		//doubleclick//
		
		
		mo.contextClick(abasics).build().perform();
		
		kb.keyPress(KeyEvent.VK_DOWN);
		kb.keyRelease(KeyEvent.VK_DOWN);
		
		kb.keyPress(KeyEvent.VK_DOWN);
		kb.keyRelease(KeyEvent.VK_DOWN);
		
		kb.keyPress(KeyEvent.VK_ENTER);
		kb.keyRelease(KeyEvent.VK_ENTER);
		
		
		WebElement apay = driver.findElement(By.xpath("(//a[@data-csa-c-type='link'])[4]"));
          //click
		mo.click(apay).build().perform();
		
		TakesScreenshot s = (TakesScreenshot) driver;
		
		File Source = s.getScreenshotAs(OutputType.FILE);
		
		File Desti = new File ("C:\\Users\\PREM KUMAR\\eclipse-workspace\\Selenium\\SS\\ama.png");
		
		FileUtils.copyFile(Source, Desti);
		
		driver.get("http://www.leafground.com/pages/drop.html");
		
		//source
		
		
		WebElement source = driver.findElement(By.id("draggable"));
		
		
		//Destination
		
		WebElement Destination = driver.findElement(By.id("droppable"));
		
		//movetoelement
		
		mo.clickAndHold(source).moveToElement(Destination).build().perform();
		
		//drag and drop
		
		//mo.dragAndDrop(source, Destination).build().perform();
		
	
		

		
		
		
		
		
		
		
		
		
		
	}

}
