Feature: HRM Login Test Case
Scenario: Verify user able to login with user id and password
Given Open the application login page in browser
When User enters user name and password
Then home page will be displayed
Scenario: Applying for leave
Given Click Leave and Apply entity
Then Enter leave type and date and reason
Then click on Apply button
Scenario: Searching employee using username and employee name
Given Click on Admin entity
Then Give Username as "Admin" and employeeName as "Paul Collings"
Then Give Username as "Russel.Hamilton"

	

