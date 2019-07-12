package gcube.com;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class HondaStaging {

	public static void main(String []arg) throws Exception 
	{
	System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\Browser Drivers\\ChromeDriver\\74 version\\chromedriver.exe");
	System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "D://SELENIUM//chrome.log");
	System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://50.16.49.139:81/Default.aspx");
	
	driver.findElement(By.xpath("//input[@id='Password']/following::div[5]/child::a[1]")).click();;
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@id='SelectedLogOnCode']")).sendKeys("01260");
	Thread.sleep(4000);
	//driver.findElement(By.xpath("//input[@id='UserEmail']")).sendKeys("learner4@gmail.com");
	//Thread.sleep(4000);
	System.out.println("successfully enter value");
	
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  String captcha;
	  System.out.println("Please Enter the CAPTCHA Code:: ");
      captcha = br.readLine();
      System.out.println("Entered  CAPTCHA Code is:: "+captcha);
	driver.findElement(By.xpath("//input[@id='CapchaText']")).sendKeys(captcha);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='CapchaText']/following::button[1]")).click();
Thread.sleep(2000);
	//	WebElement element=driver.findElement(By.xpath("//select[@id='Client']"));
	//Select dropdown=new Select(element);
	//dropdown.selectByIndex(2);
	//System.out.println("successfully select dropdown");
	
	//WebElement username=driver.findElement(By.xpath("//input[@id='UserName']"));
//	username.sendKeys("00100");
//WebElement password=	driver.findElement(By.xpath("//input[@id='Password']"));
	//password.sendKeys("password");
	//if("!username&&password"=="00100&&password") 
	//{
	//driver.findElement(By.xpath("//div[@class='container']/descendant::div[5]/child::div[2]/child::div[1]"));	
	//driver.findElement(By.xpath("//input[@id='Password']/following::div[5]/child::a[1]"));
	//}
	//driver.findElement(By.xpath("//input[@id='Password']/following::div[5]/child::a[1]"));
	//driver.findElement(By.xpath("//input[@id='Password']/following::div[4]/child::a[1]")).click();
    
	//WebDriverWait wait = new WebDriverWait(driver,30);
    //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id = 'btnSessionExpiredCancelled']")));
	//Thread.sleep(4000);
	System.out.println("Home Page successfully Open");
	
	
	
	//driver.close();
	
    }
}