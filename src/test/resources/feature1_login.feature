Feature: Validating Login credentials for ExpleoSurance

  Scenario: Validation of Login using valid credentials
    When User Enter Username and Password
    And User should click the LoginButton
    Then Login Should be successful

  Scenario Outline: Validation of invalid credentials
    Given User Enters invalid "<username>" and invalid "<password>"
    When User Click the login button
    Then Error message will be displayed

    Examples: 
      | username                                   | password   |
      | shivashankaran.kanniyappan@expleo.com      | Shiva@1919 |
      | shivashankaran.kanniyappan@expleogroup.com | Shiva@19   |
      | shivashankaran.kanniyappan@expleo.com      | Shiva@19   |
