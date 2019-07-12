package com.gcube;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public static void main(String[]arg)
	{
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\Browser Drivers\\ChromeDriver\\74 version\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		 driver.manage().deleteAllCookies();
		 driver.get("http://182.156.251.238/pif/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 System.out.println();
	driver.close();
	 System.out.println("Browser is closed successfully");
	}
}
