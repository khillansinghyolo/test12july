package com.pif.qc.skill;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Skills {
	
	
	public static void main(String[]arg) //throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\Browser Drivers\\ChromeDriver\\74 version\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://182.156.251.238/wiz7qc");
		//driver.get("http://182.156.251.238/Maruti7/Default.aspx?ClientId=1");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//nav[@id='mainNav']/descendant::a[5]")).click();
		driver.findElement(By.xpath("//input[@id='UserName']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("password");
		
		driver.findElement(By.xpath("//input[@id='Password']/following::div[4]/a")).click();
		
		driver.findElement(By.xpath("//div[@id='QLGrpId1']/a")).click();
		
		driver.findElement(By.xpath("//div[@id='sidebar']/descendant::a[5]")).click();
		//Thread.sleep(5000);
	
		//click on add  user 
		//driver.findElement(By.xpath("//div[@id='mainContainer']/descendant::a[2]")).click();
		
		//driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Learner");
		//driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("1");
		
		
		System.out.println("Add user page successfully open");
		//driver.close();
		
	
		
				
	}

}
