@All_Scenarios
Feature: ES01_Validating Login credentials for ExpleoSurance
  Author: ShivaShankaran

  Scenario Outline: Validation of Login using valid credentials
    When User Enter Username and Password
    And User should click the LoginButton
    Then Login Should be successful

