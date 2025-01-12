Feature: Forgot password functionality

  Scenario Outline: Forgot password functionality
    Given User should be in the given URL
    When User clicks the Forgot Password
    And User enters the "<Email>" "<NewPassword>" and "<ConfirmPassword>"
    And User clicks the Reset Password button
    Then User should be redirected to Login page

    Examples: 
      | Email            | NewPassword | ConfirmPassword |
      | test211@test.com | tester@123  | tester@123      |

