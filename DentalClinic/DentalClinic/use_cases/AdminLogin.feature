Feature: Admin login


  Background:user in admin page
example:
 name|password|
admin|adminpass123|

  Scenario:  admin can login
    Given admin should have name and password
    When admin enter correct name and correct password
    Then give admin authorities 

 Scenario:  admin has the wrong password
    When  admin enter correct "name" and false "password" 
    Then  don't give admin authorities with wrong pass

Scenario:  admin has the wrong name
      When  admin enter false "name" and correct "password" 
      Then  don't give admin authorities with wrong name

Scenario:  admin has the wrong information
      When  admin enter false "name" and false "password" 
      Then  don't give admin authorities with wrong information
