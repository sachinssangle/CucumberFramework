package com.vtiger.stepdefinions;

import com.vtiger.pages.HomePage;
import com.vtiger.pages.LeadPage;
import com.vtiger.pages.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Leadsteps extends BaseTest {
	
	public String TCName3 = "validLeadCreation_TC03";
	public   LoginPage lp ;
	public  HomePage hp;
	public LeadPage ldp;
	
	
	@Given("^user should on create lead page$")
	public void click_new_lead() throws Throwable {		
	  ldp = new LeadPage(driver);
	  ldp.clickNewLead();
	}
	
	@When("^user enters the mandatory fileds$")
	public void enter_mandatory_fields() throws Throwable {		
	   ldp.CreateLead(TestData.get(TCName3).get("FirstName"),TestData.get(TCName3).get("LastName"),TestData.get(TCName3).get("Company"));
	}
	
	@When("^lead should be created successfully$")
	public void verify_lead() throws Throwable {		
	   ldp.clickLogout();
	}

}
