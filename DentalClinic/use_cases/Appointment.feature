 Feature: : Appointment
 
 Scenario: add Appointment is not valid
    Given user in add Appointmaent  Page
    When  patient is not stored
    Then add Appointment is not Successfull

  Scenario: add Appointment is  valid
    Given user in add Appointmaent  Page
    When  patient is  stored
    Then add Appointment is Successfull
 