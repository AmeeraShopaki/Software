Feature: Add patient

  Scenario:  admin added a patient
    Given the admin is logged in
    When "address" and "Pname" and "phone" is filled
    And  "1000000001" is filled and valid
    Then add the patiant information to the clinic

  Scenario: guest added patient
    Given admin is not logged in
    When "address" and "Pname" and "phone" is filled
    And  "1000000001" is filled and valid
    Then show warning;
