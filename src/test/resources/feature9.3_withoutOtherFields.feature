#Author: ShivaShankaran
@All_Scenarios
Feature: New Insurance Fields - Address

  Scenario: Validation all fields of New Insurace without Address
    Given User is in LoginPage
    When selecting New Insurance Tab
    And User filled all the fields without Address
    And User click the Submit button
    Then It should show the error msg Address is Required

  Scenario: Validation all fields of New Insurace without DOB
    Given User is in LoginPage
    When selecting New Insurance Tab
    And User filled all the fields without DOB
    And User click the Submit button
    Then It should show the error msg DOB is Required
 
  Scenario: Validation all fields of New Insurace without Gender
    Given User is in LoginPage
    When selecting New Insurance Tab
    And User filled all the fields without Gender
    And User click the Submit button
    Then It should show the error msg Gender is Required

  Scenario: Validation all fields of New Insurace without PolicyType
    Given User is in LoginPage
    When selecting New Insurance Tab
    And User filled all the fields without PolicyType
    And User click the Submit button
    Then It should show the error msg Please select at least one Policy Type

  Scenario: Validation all fields of New Insurace without SumInsured
    Given User is in LoginPage
    When selecting New Insurance Tab
    And User filled all the fields without SumInsured
    And User click the Submit button
    Then It should show the error msg Please select Sum Insured

  Scenario: Validation all fields of New Insurace without Premium
    Given User is in LoginPage
    When selecting New Insurance Tab
    And User filled all the fields without Premium
    And User click the Submit button
    Then It should show the error msg Please select Premium
