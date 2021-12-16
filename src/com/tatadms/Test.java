package com.tatadms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PREM KUMAR\\eclipse-workspace\\Selenium\\Driver1\\chromedriver.exe" );
		
		WebDriver crm = new ChromeDriver();
		
		crm.get("https://crmdms.inservices.tatamotors.com/workshop/start.swe?SWECmd=Start&SWEHo=crmdms.inservices.tatamotors.com");
		
		crm.manage().window().maximize();
		
		String title = crm.getTitle();
		System.out.println("Page Title : " +title);
		
		String currentUrl = crm.getCurrentUrl();
		System.out.println("Url : " +currentUrl);
		
		String pageSource = crm.getPageSource();
		System.out.println("Page Source : " +pageSource);
		
		Thread.sleep(5000);
	    
		crm.navigate().to("https://insights.inservices.tatamotors.com/analytics/saw.dll?bieehome&startPage=1");
		
		Thread.sleep(5000);
		
		crm.navigate().back();
		
		Thread.sleep(5000);
		
		crm.navigate().forward();
		
		Thread.sleep(5000);
		
		crm.navigate().refresh();
		
		Thread.sleep(5000);
		
		crm.navigate().refresh();
		
		Thread.sleep(5000);
		
		crm.quit();
		
		crm.close();
		
		
	}

}
