#Author: ShivaShankaran

@All_Scenarios
Feature: Validating Login credentials for ExpleoSurance

  Scenario: Validation of Login using valid credentials
    When User Enter Username and Password
    And User should click the LoginButton
    Then Login Should be successful
