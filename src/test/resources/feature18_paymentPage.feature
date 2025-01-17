@All_Scenarios
Feature: ES18_Payment Page Validation
	Author: ShivaShankaran

  Scenario: Validation of Premium Calculation in Payment Page
    Given User should be in login Page
    When User enter the policy amount and calculate premium
    And User get the premium amount and print
    Then User click proceed to pay