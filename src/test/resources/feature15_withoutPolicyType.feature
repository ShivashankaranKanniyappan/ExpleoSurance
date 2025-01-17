@All_Scenarios
Feature: ES15_New Insurance Fields - PolicyType
  Author: ShivaShankaran

  Scenario: Validation all fields of New Insurace without PolicyType
    Given User is in LoginPage
    When selecting New Insurance Tab
    And User filled all the fields without PolicyType
    And User click the Submit button
    Then It should show the error msg Please select at least one Policy Type
