Feature: Login user

Scenario: Successfully Login with Valid Credentials without parameter
Given User Launch Chrome Browser
When User open nopcommerce url
And User enters register username and password
And click on Login
Then Page Title should be "Dashboard / nopCommerce administration" 
When User click on Logout link
Then Page Title should be "Your store. Login"
And close browser




