Feature: Validation of Deleting Users in ExpleoSurance Site

  @deleteUser
  Scenario Outline: Deleting Registered Users
    Given User enter the ExpleosuraceHome page
    When User clicks the delete button for the selected Users
    Then User should be deleted in the Dashboard

    Examples: 
      | Username         | Password |
      | test211@test.com | tester@1 |
      | test221@test.com | tester@2 |
      | test231@test.com | tester@3 |
