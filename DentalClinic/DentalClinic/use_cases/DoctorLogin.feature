Feature: Doctor login


  Background:user in Doctor page
example:
 name|password|
ahmad|12345|

  Scenario: Doctor can login
    Given  Doctor in login page
    When Doctor enter correct name and correct password
    Then give Doctor authorities 

 Scenario:  Doctor has the wrong information
    When  Doctor enter false "name" or false "password" 
    Then  don't give Doctor authorities with wrong info
