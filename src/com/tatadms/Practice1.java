package com.tatadms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;

public class Practice1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
		
		WebElement tshirt = driver.findElement(By.xpath("//a[@title='Women']"));
				
		tshirt.click();
		
		Thread.sleep(3000);
		
		WebElement dresses = driver.findElement(By.xpath("(//a[contains(@title,'evening')])[1]"));
		dresses.click();
		
		
		WebElement casual = driver.findElement(By.xpath("(//a[contains(@title,'day?')])[1]"));
		casual.click();
		
		WebElement dress1 = driver.findElement(By.xpath("//img[@title='Printed Dress']"));
		dress1.click();
		
		driver.switchTo().frame(0);
		
		Thread.sleep(3000);
		
		WebElement qty = driver.findElement(By.xpath("(//input[@id='quantity_wanted'])"));
		
		qty.clear();
		
		
		Thread.sleep(3000);
		
		qty.sendKeys("3");
		
		Thread.sleep(3000);
		
		WebElement dsize = driver.findElement(By.xpath("//select[@name='group_1']"));
		
		Select s = new Select(dsize);
		
		s.selectByIndex(1);
		
		Thread.sleep(3000);
	
		WebElement add2cart = driver.findElement(By.xpath("(//button[@class='exclusive'])[1]"));
		
		add2cart.click();
		
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(3000);	
		
		WebElement proceed = driver.findElement(By.xpath("//span[contains(text(),'checkout')]"));
		
		proceed.click();
		
		
		Thread.sleep(3000);
		
			
		WebElement procced2 = driver.findElement(By.xpath("(//span[contains(text(),'checkout')])[2]"));
		
		procced2.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
