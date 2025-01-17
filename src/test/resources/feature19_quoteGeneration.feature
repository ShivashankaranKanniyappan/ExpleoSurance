@All_Scenarios
Feature: ES19_Quote Generation
  Author: ShivaShankaran

  Scenario Outline: Validation of Quote Generation Page
    Given User should be in login Page
    When User enter the quote generation page
    And User enters "<PolicyType>", "<CoverageAmount>" and "<CustomerAge>"
    And User click Generate Quote
    Then it should show the quoted amount

    Examples: 
      | PolicyType | CoverageAmount | CustomerAge |
      | Life       |          50000 |          25 |
      | Health     |          30000 |          26 |
      | Auto       |          40000 |          31 |
      | Home       |          60000 |          28 |