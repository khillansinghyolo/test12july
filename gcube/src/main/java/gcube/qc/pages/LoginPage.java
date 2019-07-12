package gcube.qc.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;

import gcube.gc.base.Base;

public class LoginPage extends Base {
	
	SoftAssert softassert = new SoftAssert();
	
	//page factory
	@FindBy(xpath="//nav[@id='mainNav']/descendant::a[6]")
	WebElement login;
	@FindBy(xpath= "//input[@id='UserName']")
	WebElement username;
	@FindBy(xpath="//input[@id='Password']")
	WebElement password;
	
	@FindBy(xpath="//div[@id='divCaptchImage']/following::a[1]")
	WebElement loginclick;
	
	@FindBy(xpath="//div[@id='divCaptchImage']/following::a[2]")
	WebElement Forgatepassword;
	
	@FindBy(xpath="//div[@id='divCaptchImage']/following::a[3]")
	WebElement createaccount;
	
	@FindBy(xpath="//nav[@id='mainNav']/descendant::img[1]")
	WebElement pagetitle;
	
	//method
	
	
	
}
