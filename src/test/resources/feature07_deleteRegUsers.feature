@All_Scenarios
Feature: ES07_Delete Registered User from the HomePage
  Author: ShivaShankaran

  Scenario Outline: Delete Registered Users
    Given User should be in expleoHome page
    When User select the UserDetails and delete
    And It Should be Redirected to HomePage Again

    Examples: 
      | Username         | Password |
      | test211@test.com | tester@1 |