package TestNGDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LearningTestNG {

	public String url="http://182.156.251.238/Maruti7/";
	public WebDriver driver;
	public String driverPath="D:\\SELENIUM\\Browser Drivers\\ChromeDriver\\74 version\\chromedriver.exe";
	@BeforeTest
	public void setUp() 
	{
		System.setProperty("webdriver.chrome.driver",driverPath );
		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "D:\\SELENIUM\\chrome.log");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.get(url);
		
	}
	@Test
	public void openBrowser() 
	{
		System.out.println(driver.getTitle());
		String expectedTitle="e-gurukul"; 
		String actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		
		driver.findElement(By.xpath("//nav[@id='mainNav']/descendant::a[6]")).click();
		driver.findElement(By.xpath("//input[@id='UserName']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("password");
		driver.findElement(By.xpath("//input[@id='UserName']/following::a[1]")).click();
		 
		boolean system=driver.findElement(By.xpath("//div[@id='rightNav']/preceding::span")).isDisplayed();
		if(system)
		{
			System.out.println("successfully Home page open");
		}
		else
		{
			System.out.println("successfully Home page not open");
		}
	
	} 
	
		
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
		System.out.println("closed browser");
	}
	
}
