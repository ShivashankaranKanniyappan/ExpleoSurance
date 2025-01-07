Feature: Delete Multiple policy details

  Scenario: Validating multiple policy deletion
    Given User should be in login page
    When User delete the selected policy details
    And The policy should be deleted
    Then Validate Dashboard page
