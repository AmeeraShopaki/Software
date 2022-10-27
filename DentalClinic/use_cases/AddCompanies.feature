 Feature: add Companies 
 
 
 Scenario: add company is valid
    Given user in company Registration Page
    When "name" and "location" and "mobile Number"  is filled
    Then Registration comany is Successfull
