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
import org.openqa.selenium.support.ui.Select;

public class MultipleDrpDwn {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		driver.manage().window().maximize();
		
		WebElement multi = driver.findElement(By.xpath("//select[@multiple]"));
		
		Select d = new Select(multi);
		
		boolean multiple = d.isMultiple();
		
		System.out.println("Is it Multiple??? "+multiple);
		
		List<WebElement> options = d.getOptions();
		
		for (WebElement i : options) {
			
			System.out.println(i.getText());
		}
		
		int size = options.size();
		System.out.println("The size of the list is : " +size);
		
		
		for (int i = 0; i < size; i++) {
			
			if (i==2|i==4 |i==3) {
				
				d.selectByIndex(i);
			
				
			}
			
		}
		
		List<WebElement> allSelectedOptions = d.getAllSelectedOptions();
		
		System.out.println("The list Of Selected Options");
		
		for (WebElement i : allSelectedOptions) {
			System.out.println(i.getText());
		}
		
		TakesScreenshot s = (TakesScreenshot) driver;
		
		File source = s.getScreenshotAs(OutputType.FILE);
		
		File desti = new File("C:\\Users\\PREM KUMAR\\eclipse-workspace\\Selenium\\SS\\fgh.png");
		
		FileUtils.copyFile(source, desti);
		
		Thread.sleep(3000);
		
		d.deselectByIndex(2);
		
		Thread.sleep(3000);
		
		d.deselectByValue("4");
		
		Thread.sleep(3000);
		
		d.deselectByVisibleText("Appium");
		
		Thread.sleep(3000);
				
		WebElement firstSelectedOption = d.getFirstSelectedOption();
        
		System.out.println("The First Option Is : "+firstSelectedOption.getText());
        
		Thread.sleep(3000);
		
        d.deselectAll();
		
		
		driver.quit();
		
	}

}
