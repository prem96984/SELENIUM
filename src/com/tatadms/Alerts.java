package com.tatadms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	
	    public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PREM KUMAR\\eclipse-workspace\\Selenium\\Driver1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
						
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		 //Simple Alert
		 
		 WebElement findElement =
		 
	     driver.findElement(By.xpath("(//a[@data-toggle='tab'])[1]")); 
		 
		 Thread.sleep(3000);
		 
		 WebElement findElement1 =
		
	     driver.findElement(By.xpath("//button[contains(@onclick,'al')]"));
		 
		 
		 
		findElement1.click();
		 
	    Thread.sleep(3000);
		 
		driver.switchTo().alert().accept();
		
		Thread.sleep(3000);
		
		//Confirm Alert
		
		WebElement findElement2 = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		
		findElement2.click();  //Confirm Alert
		
		
				
		Thread.sleep(3000);
		
		
		
		WebElement findElement3 = driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']"));
		
		findElement3.click();
		
		Thread.sleep(3000);
		
		driver.switchTo().alert().dismiss();
		
		Thread.sleep(3000);
		
		//Prompt Alert
		
		WebElement findElement4 = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		
		findElement4.click();
		
		Thread.sleep(3000);
		
		WebElement findElement5 = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		
		findElement5.click();
		
		Thread.sleep(3000);
		
		//gettext();
		
		String text = driver.switchTo().alert().getText();
		
		System.out.println("Before Prompt : "+text);
		
		Thread.sleep(3000);
		
		
		driver.switchTo().alert().sendKeys("findElement5");
		
		Thread.sleep(3000);
		
		String text2 = driver.switchTo().alert().getText();
		
		System.out.println("After Prompt : "+text2);
		
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
				
		
	}

}
