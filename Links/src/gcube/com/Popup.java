package gcube.com;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class Popup {
		public static void main(String[] args) throws InterruptedException 
		{
			System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\Browser Drivers\\ChromeDriver\\74 version\\chromedriver.exe");
			System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "D://SELENIUM//chrome.log");
			System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("http://demo.guru99.com/popup.php");
			Thread.sleep(1000);
			//System.out.println(driver.getTitle());
			driver.findElement(By.xpath("//div[@class='row']/following::a[1]")).click();
			System.out.println("successfully open");
			
			String mainwindow=driver.getWindowHandle();
			
			Set<String> s1=driver.getWindowHandles();
			Iterator<String> i1=s1.iterator();
			
			while(i1.hasNext())			
	        {		
	            String ChildWindow=i1.next();		 		
	            if(!mainwindow.equalsIgnoreCase(ChildWindow))			
	            {    		
	                    // Switching to Child window
	                    driver.switchTo().window(ChildWindow);	                                                                                                           
	                    driver.findElement(By.xpath("//label[@id='message9']/preceding::input[1]"))
	                    .sendKeys("khillanverma@gmail.com");                			
	                    
	                    driver.findElement(By.xpath("//label[@id='message9']/following::input[1]")).click();			
	                    Thread.sleep(1000);   
	                    System.out.println("Successfully closed ");
				// Closing the Child Window.
	                    
	                        driver.close();		
	            }		
	        }		
	        // Switching to Parent window i.e Main Window.
	           // driver.switchTo().window(mainwindow);				
	    }		

	}


