@All_Scenarios
Feature: ES04_Validation of deleting Existing insurance
  Author: ShivaShankaran

  Scenario: Validation of deleting insurance details in dashboard
    Given User should be logged in successfully
    When User clicks the delete button
    And User clicks the Yes or No
    Then Insurance entry should be deleted in the dashboard page