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

public class Facebook2 {
	
public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PREM KUMAR\\eclipse-workspace\\Selenium\\Driver1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement sign = driver.findElement(By.xpath("(//a[@role='button'])[2]"));

		sign.click();
		
		Thread.sleep(3000);
	
		WebElement firstname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		boolean displayed = firstname.isDisplayed();
		System.out.println("Displayed : "+displayed);
		
		boolean enabled = firstname.isEnabled();
		System.out.println("Enabled : "+enabled);
		
		
		firstname.sendKeys("Prem");
		
		Thread.sleep(3000);
		
		WebElement lastname = driver.findElement(By.xpath("(//input[contains(@type,'text')])[3]"));
		
		lastname.sendKeys("Kumar");
		
		Thread.sleep(3000);
		
		WebElement mobileemail = driver.findElement(By.name("reg_email__"));
		
		mobileemail.sendKeys("9698471147");
		
		Thread.sleep(3000);
		
		WebElement newpass = driver.findElement(By.id("password_step_input"));
		
		newpass.sendKeys("123");
		
		Thread.sleep(3000);
		
		WebElement gender = driver.findElement(By.xpath("(//label[@class='_58mt'])[2]"));
		
		gender.click();
		
		Thread.sleep(3000);
		
		WebElement ok = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		
	    ok.click();
	    
	    Thread.sleep(3000);
	    
        TakesScreenshot ts = (TakesScreenshot) driver;  //narrowing  higher band with to lower band width
	    
	    File source=ts.getScreenshotAs(OutputType.FILE);
	    
	   File destination=new File("C:\\Users\\PREM KUMAR\\eclipse-workspace\\Selenium\\SS\\login.png");
	   
	   FileUtils.copyFile(source,destination);
	   
	    
		
		
		
		
}
}