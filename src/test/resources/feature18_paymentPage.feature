@All_Scenarios
Feature: New Insurance Fields - Premium
  Author: ShivaShankaran

  Scenario: ES18_Validation all fields of New Insurace without Premium
    Given User is in LoginPage
    When selecting New Insurance Tab
    And User filled all the fields without Premium
    And User click the Submit button
    Then It should show the error msg Please select Premium
