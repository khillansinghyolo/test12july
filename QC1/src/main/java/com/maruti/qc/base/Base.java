package com.maruti.qc.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.maruti.qc.util.Util;

public class Base 
{
	
public static WebDriver driver;
public static Properties prop;
public Base()
{
	try
	{
		prop=new Properties();
		FileInputStream ip= new FileInputStream("C:\\Users\\khillanv\\eclipse-workspace\\QC1\\src\\main\\java\\com\\maruti\\qc\\config\\config.properties");
		prop.load(ip);
	}
	catch(FileNotFoundException e) {e.printStackTrace();}
	catch(IOException e) {e.printStackTrace();}
}
	
public static void initialization()
{
	String browserName=prop.getProperty("url");
	if(browserName.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\Browser Drivers\\ChromeDriver\\74 version\\chromedriver.exe");
		driver=new ChromeDriver();
	}

	else if(browserName.equals("FF"))
	{
			System.setProperty("webdriver.gecko.driver","D:\\SELENIUM\\Browser Drivers\\GeckoDriver\\geckodriver.exe");
			
			driver=new FirefoxDriver();
	}	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(Util.PAGE_LOAD_TIME_OUT, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(Util.IMPLICIT_WAIT_TIME_OUT, TimeUnit.SECONDS);
	driver.get(prop.getProperty("url"));
	
}

}


