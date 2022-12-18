Feature: Patient login


  Background:user in patient home page
Example:
 name|password|
ameera|1234|

  Scenario: patient can login
    Given patient in login page
    When patient enter correct name and correct password
    Then give patient authorities 

 Scenario:  patient has the wrong information
    When  patient enter false "name" or false "password" 
    Then  don't give patient authorities with wrong info

