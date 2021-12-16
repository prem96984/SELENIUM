package com.tatadms;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Adactin {
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver1\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://adactinhotelapp.com/index.php");
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("page URL ; "+currentUrl);
					
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.name("username"));
		
		boolean enabled = username.isEnabled();
		System.out.println("is it Enabled to enter User Id : "+enabled);
		
		username.sendKeys("prem96984");
		
		WebElement password = driver.findElement(By.id("password"));
		
		boolean displayed = password.isDisplayed();
		System.out.println("Displayed???   :"+displayed);
		
		password.sendKeys("vts@1147");
		
		WebElement loginclick = driver.findElement(By.xpath("//input[@type='Submit']"));
		loginclick.click();
		
		String title = driver.getTitle();
		System.out.println("Current Page Title : "+currentUrl);
		
		WebElement Location = driver.findElement(By.name("location"));
		
		Select s = new Select(Location);
		
		s.selectByIndex(1);
		
		WebElement Hotel = driver.findElement(By.xpath("(//select[@class='search_combobox'])[2]"));
		
		Select s1 = new Select(Hotel);
		
		s1.selectByValue("Hotel Sunshine");
		
		WebElement RoomType = driver.findElement(By.xpath("(//select[@class='search_combobox'])[3]"));
		
		Select s2 = new Select(RoomType);
		
		boolean multiple = s2.isMultiple();
		System.out.println("Can we Select multiple type Room ; "+multiple);
		
		s2.selectByVisibleText("Super Deluxe");
		
		WebElement No_of_Rooms = driver.findElement(By.xpath("(//select[@class='search_combobox'])[4]"));
		
		Select s3 = new Select(No_of_Rooms);
		
		s3.selectByValue("4");
		
		WebElement Checkin = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		
		Checkin.clear();
		
		Checkin.sendKeys("11/12/2021");
		
		WebElement Checkout = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		
		Checkout.clear();
		
		Checkout.sendKeys("14/12/2021");
		
		WebElement apr = driver.findElement(By.xpath("(//select[@class='search_combobox'])[5]"));
		
		Select s4 = new Select(apr);
		
		s4.selectByIndex(4);
		
		WebElement cpr = driver.findElement(By.xpath("(//select[@class='search_combobox'])[6]"));
		
		Select s5 = new Select(cpr);
		
		s5.selectByIndex(4);
		
		WebElement Submit1 = driver.findElement(By.id("Submit"));
		
		Submit1.click();
		
		WebElement submit2 = driver.findElement(By.id("radiobutton_0"));
		
		submit2.click();
		
		WebElement continue1 = driver.findElement(By.id("continue"));
		
		Actions a = new Actions(driver);
		
		a.click(continue1).build().perform();
		
		WebElement first_name = driver.findElement(By.id("first_name"));
		
		first_name.click();
		
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_CAPS_LOCK);
		
		r.keyPress(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_P);
		
		r.keyPress(KeyEvent.VK_R);
		r.keyRelease(KeyEvent.VK_R);
		
		r.keyPress(KeyEvent.VK_E);
		r.keyRelease(KeyEvent.VK_E);
		
		r.keyPress(KeyEvent.VK_M);
		r.keyRelease(KeyEvent.VK_M);
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		//WebElement last_name = driver.findElement(By.id("last_name"));
		
		//last_name.click();
		
		r.keyPress(KeyEvent.VK_K);
		r.keyRelease(KeyEvent.VK_K);
		
		r.keyPress(KeyEvent.VK_U);
		r.keyRelease(KeyEvent.VK_U);
		
		r.keyPress(KeyEvent.VK_M);
		r.keyRelease(KeyEvent.VK_M);
		
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		
		r.keyPress(KeyEvent.VK_R);
		r.keyRelease(KeyEvent.VK_R);
		
		r.keyRelease(KeyEvent.VK_CAPS_LOCK);
								
		WebElement address = driver.findElement(By.id("address"));
		
		address.sendKeys("No.12, Vivekanandhar Street,\r\n" + 
				"Dubai main Road, Dubai\r\n" + 
				")");
		
		WebElement ccnum = driver.findElement(By.id("cc_num"));
		
		ccnum.sendKeys("1234567891234567");

		WebElement cc_type = driver.findElement(By.name("cc_type"));
		
		Select s6 = new Select(cc_type);
		
		s6.selectByValue("MAST");
		
		WebElement cc_exp_month = driver.findElement(By.name("cc_exp_month"));
		
		Select s7 = new Select(cc_exp_month);
		
		s7.selectByVisibleText("February");
		
		WebElement cc_exp_year = driver.findElement(By.id("cc_exp_year"));
		
		Select s8 = new Select(cc_exp_year);
		
		s8.selectByIndex(3);
		
		WebElement cvv = driver.findElement(By.xpath("(//input[@type='text'])[14]"));
		
		cvv.sendKeys("486");
		
		WebElement booknow = driver.findElement(By.xpath("(//input[@type='button'])[1]"));
		
		a.click(booknow).build().perform();
		
		
		
	}

}
