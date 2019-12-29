Feature: Customers

Scenario: Add a new customer
Given User Launch Chrome Browser
When User open URL "https://admin-demo.nopcommerce.com/login"
And User enters Email as "admin@yourstore.com" and Password as "admin"
And click on Login
Then User view user Dashboard
When User click on Customer's Menu
And click on Customer's Menu Item
And User click on Add new button
Then User view Add new customer page
When User enter customer info
And click on Save button
Then User can view confirmation message "The new customer has been added successfully."
And close browser


