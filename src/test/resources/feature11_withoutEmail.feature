@All_Scenarios
Feature: ES11_New Insurance Fields - Email
  Author: ShivaShankaran

  Scenario: Validation all fields of New Insurace without Email
    Given User is in LoginPage
    When selecting New Insurance Tab
    And User filled all the fields without Email
    And User click the Submit button
    Then It should show the error msg and then Logout
