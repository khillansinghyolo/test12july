package com.maruti.qc.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.maruti.qc.base.Base;

public class LoginPage extends Base {
	
	@FindBy(id="UserName")
	WebElement UserName;
	
	@FindBy(id="Password")
	WebElement Password;
	
	@FindBy(xpath="//input[@id='Mode']/following::a[2]")
	WebElement LoginLink;
	
	
	public LoginPage()
	{
		super();	
		PageFactory.initElements(driver,this);
	}
	 
	public void main()
	{
		
	}
	

}
