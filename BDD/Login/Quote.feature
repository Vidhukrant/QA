Feature: Quote Journey 
Scenario Outline: Verify that main elements on Homepage (Step 1) is displayed

    Given User launch the Browser 
    When User open Homepage
    Then User verify that the page displays Single and Annual Multi Trip selection box
    And User enter country name in  travel destination listbox "<destination>"
    And User enter date in leaving field "<Leaving date>"
    And the page displays Returning On date field
    And User enter Age of Primary Traveller "<Primary age>"
    And User enter Age of Secondry Traveller "<Secondry age>"
    And User enter no. of dependent "1"
    And User enter postcode "<Post code>"
    And the page displays Are you a memeber Deopdown list
    And the page displays Get a Quote button

    And User naviagted to Coverage Details page (Step 2)
    When User select one of the coverage plan
    And User select Choose your excess as $250
    And User select Going on a Cruise? as Yes
    And User select Ski/Winter Sports? as Yes
    And User click on Continue button
    Then User should be naviagted to Customer Details page

    And User enter details of  Primary Traveller First Name "<Primaryf>"
    And User enter details of  Primary Traveller Last Name "<P2l>"
    And User enter details of  Primary Traveller Date of Birth date "<P>"
    And User enter details of  Secondry Traveller First Name "<Secondryf>"
    And User enter details of  Secondry Traveller Last Name "<lname>"
    And User enter details of  Secondry Traveller Date of Birth date "<Sdob>"
    
    And User enter Address in street text field "<Address>"
    And User enter Subrb in Subrb text field "Subrb1"
    And User select the state from state drop down
    And User enter post code "<Post>"
    And User enter email address in email address text box "<Email>"
   
    And User enter primary phone number "0123456789"
    And the page displays Dependents First name text field in Dependents section
    And the page displays Dependents Last name text field in Dependents section
    And the page displays Dependents Age text field in Dependents section
    And the page displays Yes/No selection box in Medical conditions not found in the automatically covered conditions question
    And the page displays Confirm and Finalize Quote button
    Then User should be naviagted to Payemnt Details page (Step 4)
    
    Examples:
    |destination||Leaving date||Primary age||Secondry age||Post code||Primaryf||P2l||P||Secondryf||lname||Sdob||Address||Post||Email|
    |India||25||30||32||2000||Leah||Thomas||14/10/1989||David||Smith||20/10/1987||Address India||2000||Test@gmail.com|
    |australia||29/11/2019||40||20||4040||Rory||Arnold||20/10/1979||Elicia||Hart||05/09/1999||Address Australia||4040||abc@gmail.com|
    
    
    
    
    
    
    
    
    
   