Feature: Login 


Scenario Outline: User logged with admin credentials in successfully
Given user open the browser
When user click on signin link
And User enter username "<Username>"
And User enter password "<Password>"
And user click on sign in button
Then validate user logged in successfully
Examples:
|Username||Password|
|automationwithpankaj2@gmail.com||test@1234|
|automationwithpankaj@gmail.com||test@1234|



