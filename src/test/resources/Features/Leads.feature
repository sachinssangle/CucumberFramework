@regression
Feature: Login Functionality

Background:
Given user should be launched application
When user enters valid userid and valid password and click on login button
Then user should logged in successfully and navigated to home page

@smoke
Scenario: Create Lead with mandatory fields
Given user should on create lead page
When user enters the mandatory fileds
Then lead should be created successfully
Then close browser