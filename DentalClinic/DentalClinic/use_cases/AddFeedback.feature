 Feature: : Add FeedBack
 
 
 Scenario: add FeedBack is not valid
    Given user in add FeedBack  Page
    When  This patient is not stored
    Then add FeedBack is not Successfull

  Scenario: add FeedBack is  valid
    Given user in add FeedBack  Page
    When   this patient is  stored
    Then add FeedBack is Successfull
 
    