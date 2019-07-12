package gcube.gc.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import gcube.gc.util.TestUtil;

public class Base {

		public static  WebDriver driver;
		public static Properties prop;
		public Base()
		{
			try
			{
				prop=new Properties();
				FileInputStream ip= new FileInputStream("C:\\Users\\khillanv\\eclipse-workspace\\gcube\\src\\main\\java\\gcube\\gc\\config\\config.properties");
				prop.load(ip);
			}
			catch(FileNotFoundException e) {e.printStackTrace();}
			catch(IOException e) {e.printStackTrace();}
		}
		
		public static void initialization()
		{
			String browserName=prop.getProperty("Browser");
			if(browserName.equals("chrome")) 
			{
				System.setProperty("webdriver.chrome.driver","D:\\seleniumjarfile\\chromedriver");
				 driver = new ChromeDriver();
			}
			else if(browserName.equals("FF")) 
			{
				System.setProperty("webdriver.gecko.driver","D:\\seleniumjarfile\\geckodriver");
				 driver = new FirefoxDriver();
			}
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(TestUtil.IMPLECIT_WAIT,TimeUnit.SECONDS);
	
			
		}	
		
		
		
}
