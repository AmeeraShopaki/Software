 Feature: patient Registeration
 
 
 Scenario: add patient is valid
    Given user in Patient Registration Page
    When "name" and "age" and "mobile Number" and "password" is filled
    Then Registration patient is Successfull
