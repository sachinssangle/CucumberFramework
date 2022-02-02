package com.vtiger.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.vtiger.lib.GenericMethods;

public class LoginPage {
	
	private WebDriver driver;
	private GenericMethods gm;
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
		gm = new GenericMethods(driver);
		
	}
	
	@FindBy(name="user_name")
	WebElement userid;
	
	@FindBy(name="user_password")
	WebElement userpwd;
	
	@FindBy(name="Login")
	WebElement btnLogin;
	
	
	
	
	public void Login(String username, String userpassword)
	{
		gm.EnterValue(userid, username);	
		gm.EnterValue(userpwd, userpassword);		
		gm.ClickElement(btnLogin);		
	}

}
