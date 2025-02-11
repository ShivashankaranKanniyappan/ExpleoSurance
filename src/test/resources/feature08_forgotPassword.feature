@All_Scenarios
Feature: ES08_Forgot password functionality
  Author: ShivaShankaran

  Scenario Outline: Forgot password functionality
    Given User should be in the given URL
    When User clicks the Forgot Password
    And User enters the "<Email>" "<NewPassword>" and "<ConfirmPassword>"
    And User clicks the Reset Password button
    Then User should be redirected to Login page

    Examples: 
      | Email            | NewPassword | ConfirmPassword |
      | shiva@expleo.com | Shiva@19    | Shiva@19        |
