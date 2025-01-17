@All_Scenarios
Feature: ES10_New Insurance Fields - Name
  Author: ShivaShankaran

  Scenario: Validation of New Insurance Fields without Name
    Given User should be in login Page for field validating
    When User Clicks the NewInsurance Tab
    And User enters all the Fields Without Name
    Then User click the Submit button and it should show Error
