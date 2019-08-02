package Seleniumdemo;

import java.io.File;
import java.nio.file.Files;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;


public class Demo1 {

	public static void main(String[] args) {
	 
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\Browser Drivers\\ChromeDriver\\74 version\\edriver.exe");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "D:\\SELENIUM\\chrome.log");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try
		{
			
		}
		catch(Exception e) {System.out.println("e");}
	}

}
