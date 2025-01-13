#Author: ShivaShankaran
@All_Scenarios
Feature: New Insurance Fields - Name

  Scenario: Validation of New Insurance Fields without Name
    Given User should be in login Page for field validating
    When User Clicks the NewInsurance Tab
    And User enters all the Fields Without Name
    Then User click the Submit button and it should show Error