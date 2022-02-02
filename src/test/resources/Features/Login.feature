@regression
Feature: Login Functionality

Background:
Given user should be launched application

@smoke
Scenario: Valid Login
When user enters valid userid and valid password and click on login button
Then user should logged in successfully and navigated to home page
And user can see logout link appear on home page
And close browser


Scenario: Valid Login1
When user enters valid userid and valid password and click on login button
Then user should logged in successfully and navigated to home page
And user can see logout link appear on home page
And close browser


Scenario: Valid Login2
When user enters valid userid and valid password and click on login button
Then user should logged in successfully and navigated to home page
And user can see logout link appear on home page
And close browser


Scenario Outline: InValid Login
When user enters invalid "<userid>" and "<Password>" and click on login button
Then user should see error message
And close browser
Examples:
|userid | Password |
|abcd   | aaddDDDDD|
|XXXXXXX|RQRQRQQQRRQ|
|YYYYYY |gafafafafaf|
