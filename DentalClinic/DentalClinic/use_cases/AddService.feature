 Feature: add service and offer 
 
 
 Scenario: add service is valid
    Given user in servies add Page
    When "service name" and "service description" and "price" and "discount" is enter
    Then add service and offer is Successfull
