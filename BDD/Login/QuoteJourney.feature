Feature: Quote Journey 
Scenario: Verify that main elements on Homepage (Step 1) is displayed

    Given User launch the Browser 
    When User open Homepage
    Then User verify that the page displays Single and Annual Multi Trip selection box
    And User enter country name in  travel destination listbox "India"
    And User enter date in leaving field "20/11/2019"
    And the page displays Returning On date field
    And User enter Age of Primary Traveller "30"
    And User enter Age of Secondry Traveller "30"
    And User enter no. of dependent "1"
    And User enter postcode "2000"
    And the page displays Are you a memeber Deopdown list
    And the page displays Get a Quote button

    And User naviagted to Coverage Details page (Step 2)
    When User select one of the coverage plan
    And User select Choose your excess as $250
    And User select Going on a Cruise? as Yes
    And User select Ski/Winter Sports? as Yes
    And User click on Continue button
    Then User should be naviagted to Customer Details page

    And User enter details of  Primary Traveller First Name "FirstName"
    And User enter details of  Primary Traveller Last Name "LastName"
    And User enter details of  Primary Traveller Date of Birth date "14/10/1990"
    And User enter details of  Secondry Traveller First Name "FirstName2"
    And User enter details of  Secondry Traveller Last Name "LastName2"
    And User enter details of  Secondry Traveller Date of Birth date "10/10/1990"
    
    And User enter Address in street text field "Address1"
    And User enter Subrb in Subrb text field "Subrb1"
    And User select the state from state drop down
    And User enter post code "2000"
    And User enter email address in email address text box "abc@gmail.com"
   
    And User enter primary phone number "0123456789"
    And the page displays Dependents First name text field in Dependents section
    And the page displays Dependents Last name text field in Dependents section
    And the page displays Dependents Age text field in Dependents section
    And the page displays Yes/No selection box in Medical conditions not found in the automatically covered conditions question
    And the page displays Confirm and Finalize Quote button
    Then User should be naviagted to Payemnt Details page (Step 4)