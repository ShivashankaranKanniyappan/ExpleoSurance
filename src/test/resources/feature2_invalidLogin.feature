@All_Scenarios
Feature: Invalid login Credentials validation
	
  Scenario Outline: Validation of invalid credentials
    Given User Enters invalid "<username>" and invalid "<password>"
    When User Click the login button
    Then Error message will be displayed

    Examples: 
      | username                                   | password   |
      | shivashankaran.kanniyappan@expleo.com      | Shiva@1919 |
      | shivashankaran.kanniyappan@expleogroup.com | Shiva@19   |
      | shivashankaran.kanniyappan@expleo.com      | Shiva@19   |

  Scenario Outline: Validation of Empty credentials
    Given User Enters Empty "<username>" and "<password>"
    When User Clicks the login button
    Then Error message will be displayed as Username and password are required

    Examples: 
      | username                                   | password   |
      |                                            | Shiva@1919 |
      | shivashankaran.kanniyappan@expleogroup.com |            |
      |                                            |            |
