package com.vtiger.stepdefinions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.vtiger.pages.HomePage;
import com.vtiger.pages.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Loginsteps extends BaseTest {
	public String TCName1 = "validLogin_TC01";
	public String TCName2 = "InvalidLogin_TC02";
	public   LoginPage lp ;
	public  HomePage hp;
	
	
	@Given("^user should be launched application$")
	public void user_should_be_launched_application() throws Throwable {
		lauchapp();
	  
	}

	@When("^user enters valid userid and valid password and click on login button$")
	public void user_enters_valid_userid_and_valid_password_and_click_on_login_button() throws Throwable {
	   lp = new LoginPage(driver);
	  lp.Login(TestData.get(TCName1).get("Userid"),TestData.get(TCName1).get("Password"));
	}

	@Then("^user should logged in successfully and navigated to home page$")
	public void user_should_logged_in_successfully_and_navigated_to_home_page() throws Throwable {
	    hp = new HomePage(driver);
	    hp.verifyPipeline();
	}

	@Then("^user can see logout link appear on home page$")
	public void user_can_logout_link_appear_on_home_page() throws Throwable {
	   hp.clickLogout();
	}

	@When("^user enters invalid userid and password and click on login button$")
	public void user_enters_invalid_userid_and_password_and_click_on_login_button() throws Throwable {
		lp.Login(TestData.get(TCName2).get("Userid"),TestData.get(TCName2).get("Password"));
	}

	@Then("^user should see error message$")
	public void user_should_see_error_message() throws Throwable {
	    driver.findElement(By.xpath("//*[contains(text(),'You must specify a valid username and password.')]")).isDisplayed();
	}
	
	@Then("^close browser$")
	public void close_browser() throws Throwable {
	    driver.quit();
	}
	
	@When("^user enters invalid \"([^\"]*)\" and \"([^\"]*)\" and click on login button$")
	public void user_enters_invalid_and_and_click_on_login_button(String arg1, String arg2) throws Throwable {
		 lp = new LoginPage(driver);
		lp.Login(arg1, arg2);
	}



}
