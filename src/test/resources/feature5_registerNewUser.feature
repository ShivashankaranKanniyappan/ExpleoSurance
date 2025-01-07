@AllScenarios
Feature: Register New User

  @newUser
  Scenario Outline: Validating New User Registration
    Given User Clicks the Register New Account
    When User Enters "<Email>" "<Password>" and "<ConfirmPassword>"
    And User clicks the Register button
    Then User should get the Success Message

    Examples: 
      | Email           | Password | ConfirmPassword |
      | test11@test.com | tester@1 | tester@1        |
      | test12@test.com | tester@2 | tester@2        |
      | test13@test.com | tester@3 | tester@2        |

  @registeredUser
  Scenario Outline: Validating Registered Users
    Given User enters the new registered "<Username>" and "<Password>"
    When User clicks the submit button
    Then It should be logged in Successfully

    Examples: 
      | Username        | Password |
      | test11@test.com | tester@1 |
      | test12@test.com | tester@2 |
      | test13@test.com | tester@3 |
