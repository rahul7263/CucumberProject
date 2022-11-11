Feature: Test the login functionality of OrangeHRM using DataTable

Scenario Outline: Test the valid login

Given user is on loginPage
When user enters credentails usig DataTable
      |admin|admin123|
And click on login button
Then user should land on home page


