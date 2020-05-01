Feature: SauceDemo Web-site Features Testing

Scenario: Login Page

Given user is on the login page
When when page title is Swag Labs
Then user enters the username and password
Then user clicks on login button
Then user redirected to the home page
And close the driver

