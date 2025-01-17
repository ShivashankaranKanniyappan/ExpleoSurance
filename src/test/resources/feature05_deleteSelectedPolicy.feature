#Author: ShivaShankaran
@All_Scenarios
Feature: Delete Selected Account Created in New Insurace
  I want to use this template for my feature file

  Scenario: Vaildating multiple delete account created in New Insurance
    Given User should be in Login Page
    When User Select the account using AccountName for delete
    And User clicks the delete button one by one
    Then Account should be deleted