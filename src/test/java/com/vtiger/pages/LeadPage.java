package com.vtiger.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aventstack.extentreports.ExtentTest;

public class LeadPage extends HeaderPage {
	
private WebDriver driver;
	
	public LeadPage(WebDriver driver) {
		super(driver);
		this.driver=driver;		
	}
	
	@FindBy(name="firstname")
	WebElement fname;
	
	@FindBy(name="lastname")
	WebElement lname;
	
	@FindBy(name="company")
	WebElement comp;
	
	@FindBy(name="button")
	WebElement save;
	
	
	
	
	public void CreateLead(String fistname,String lastname,String company)
	{
		gm.EnterValue(fname, fistname);
		gm.EnterValue(lname, lastname);
		gm.EnterValue(comp, company);
		gm.ClickElement(save);
	}

}
