Feature: Login user

Scenario: Successfully Login with Valid Credentials without parameter
Given User Launch Chrome Browser
When User open URL "https://admin-demo.nopcommerce.com/login"
And User enters register username and password
And click on Login
Then Page Title should be "Dashboard / nopCommerce administration" 
When User click on Logout link
Then Page Title should be "Your store. Login"
And close browser

Scenario: Successfully Login with Valid Credentials with parameter
Given User Launch Chrome Browser
When User open URL "https://admin-demo.nopcommerce.com/login"
And User enters Email as "admin@yourstore.com" and Password as "admin"
And click on Login
Then Page Title should be "Dashboard / nopCommerce administration" 
When User click on Logout link
Then Page Title should be "Your store. Login"
And close browser

Scenario Outline: Login Data Driven
Given User Launch Chrome Browser
When User open URL "https://admin-demo.nopcommerce.com/login"
And User enters Email as "<email>" and Password as "<password>"
And click on Login
Then Page Title should be "Dashboard / nopCommerce administration" 
When User click on Logout link
Then Page Title should be "Your store. Login"
And close browser

Examples:

	| email | password |
	| admin@yourstore.com | admin |
	| admin@yourstore.com | admin123 |


Scenario: Successfully Login with Valid Credentials with Datatable single parameter
Given User Launch Chrome Browser
When User open URL "https://admin-demo.nopcommerce.com/login"
And User enters registerd username and password as a parameter
    | admin@yourstore.com | admin |
	
And click on Login
Then Page Title should be "Dashboard / nopCommerce administration" 
When User click on Logout link
Then Page Title should be "Your store. Login"
And close browser


Scenario: Successfully Login with Valid Credentials with Datatable single parameter
Given User Launch Chrome Browser
When User open URL "https://admin-demo.nopcommerce.com/login"
And User enters registerd username and password as a parameter for multiple parameter testing
    |      user     | password |
    | admin@yourstore.com | admin |
And click on Login
Then Page Title should be "Dashboard / nopCommerce administration" 
When User click on Logout link
Then Page Title should be "Your store. Login"
And close browser
	