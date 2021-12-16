package com.tatadms;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windows_Handling {
	
	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		
		Actions a = new Actions(driver);
		
		Robot r = new Robot();
		
		WebElement tdaydeals = driver.findElement(By.xpath("//a[@class='nav-a  ']"));
		
		a.contextClick(tdaydeals).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		WebElement cser = driver.findElement(By.xpath("//a[@class='nav-a  '][2]"));
		
		a.contextClick(cser).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement registry = driver.findElement(By.xpath("//a[@class='nav-a  '][3]"));
		
		a.contextClick(registry).build().perform();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		//number of windows opened
		
		int size = driver.getWindowHandles().size();
		System.out.println("number of Windows Opened : "+size);
		
		// to get parent id alone
		String parent_window_id = driver.getWindowHandle();
		System.out.println("Parent id : "+parent_window_id);
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		for (String i : windowHandles) {
			
			String title = driver.switchTo().window(i).getTitle();
			System.out.println("Page Titles : "+title);
					
		}
		
		for (String i : windowHandles) {
			
			if (!i.equals(parent_window_id)) {
				
				driver.switchTo().window(i);
				driver.close();
				
			}
		}
		
		
		
		
		
	
	}
	

}
