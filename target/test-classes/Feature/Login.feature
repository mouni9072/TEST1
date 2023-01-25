Feature: Verify Login for Orange HRM
Author:Plabani
Scenario: Login with valid username and password 
Given Open the Url
When enter valid username "Admin" and Password "admin123"
And Click Login button
Then Login Successful