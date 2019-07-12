import java.util.List;

import javax.lang.model.util.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinkswithname {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM\\Browser Drivers\\ChromeDriver\\74 version\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://50.16.49.139:81/DoLogout.aspx");
		List <WebElement> lists=driver.findElements(By.tagName("a"));
		 System.out.println(lists.size());

		for(WebElement element: lists )
		{
			System.out.println(element.getAttribute("href"));
			System.out.println(element.getSize());
			System.out.println(element.getLocation());
			System.out.println(element.getText().length());
			
		}
		
		
	}

}
