#Author: ShivaShankaran
@All_Scenarios
Feature: Payment Page Validation

  Scenario: Validating payemnts page
    Given User is in LoginPage
    When selecting Payment Page
    And user enter the policy amount and calculate and press proceed payment
    And press the proceed to pay 
    And It should show the premium amount
    Then User press proceed to pay 