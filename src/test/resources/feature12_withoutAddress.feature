@All_Scenarios
Feature: ES12_New Insurance Fields - Address
  Author: ShivaShankaran

  Scenario: Validation all fields of New Insurace without Address
    Given User is in LoginPage
    When selecting New Insurance Tab
    And User filled all the fields without Address
    And User click the Submit button
    Then It should show the error msg Address is Required
