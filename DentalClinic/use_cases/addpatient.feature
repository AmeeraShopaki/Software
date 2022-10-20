#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Add patient feature
  I want to use this template for my feature file

  @tag1
  Scenario: admin added a patient
    Given  the user is admin
    And  the admin is logged in
    When "address" and "Pname" and "phone" and "ISPN" is filled
    And  "1000000001" is filled
    Then add the patiant information ("address" and "Pname" and "phone" and "ISPN")to the clinic
 

  @tag2
  Scenario Outline:  guest added patient
    Given the user is not admin
    Then show warning;
   