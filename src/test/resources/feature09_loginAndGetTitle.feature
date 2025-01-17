@All_Scenarios
Feature: ES09_Get Title and Current URL
  Author: ShivaShankaran

  Scenario: Validating Title and Current URL
    Given User enter valid login and password
    When User clicks submit it should be redirected to Dashboard Page
    And User should validate the Title and URL
    Then Logout the page
