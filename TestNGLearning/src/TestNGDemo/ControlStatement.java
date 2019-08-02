package TestNGDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ControlStatement {

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
	public void Login()
	{
		driver.navigate().to("http://182.156.251.238/Wiz7QC/Default.aspx");
		driver.findElement(By.xpath("//input[@id='UserName']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("password");
		driver.findElement(By.xpath("//input[@id='UserName']/following::a[1]")).click();
		
	    String actualUrl="http://182.156.251.238/Wiz7QC/Control/Controller.aspx?Action=valdoforward/VldtLgn";
		String currentUrl=driver.getCurrentUrl();
		Assert.assertEquals(actualUrl,currentUrl);
		System.out.println("Login Succssfully ");
		
		driver.findElement(By.xpath("//div[@id='QLGrpId18']/child::a[1]")).click();
		driver.findElement(By.xpath("//li[@id='QLid81']/child::a[1]")).click();
		
		WebDriverWait wait=new WebDriverWait(driver ,10);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@id='ExpiryDt']/following::a[2]")))).click();
		
	}
	
}
