Feature: SauceDemo Web-site Features Testing

Scenario Outline: Login Page

Given user is on the login page
When when page title is SwagLabs
Then user enters the "<username>" and "<password>"
Then user clicks on login button
Then user redirected to the home page
And close the driver

Examples:
         |        username         |     password     |
         |      standard_user      |   secret_sauce   |
         |     locked_out_user     |   secret_sauce   |
         | performance_glitch_user |   secret_sauce   |


