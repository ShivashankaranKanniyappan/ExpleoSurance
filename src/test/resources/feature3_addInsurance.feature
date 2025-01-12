#Author: ShivaShankaran

@All_Scenarios
Feature: Validation of New Insurace Details

  Scenario Outline: Validation of Adding New Insurance
    Given User should be in login Page
    When User Clicks the New Insurance Tab
    And User enters the "<Name>", "<Email>", "<Address>", "<Date>"
    And User Select the "<Gender>" and "<PolicyType>"
    And User select the "<SumInsured>" and "<Premium>"
    And User click the Submit button
    Then Page should show Insurance policy created successfully

    Examples: 
      | Name         | Email               | Address | Date       | Premium |
      | EXPLEOTester | Tester1@expleo.com  | Expleo  | 21-02-2025 |    3000 |
      | EXPLEOTester | Tester2@expleo.com  | Expleo  | 21-02-2025 |     423 |
      | EXPLEOTester | Tester3@expleo.com  | Expleo  | 21-02-2025 |     232 |
      | EXPLEOTester | Tester4@expleo.com  | Expleo  | 21-02-2025 |    5465 |
      | EXPLEOTester | Tester5@expleo.com  | Expleo  | 21-02-2025 |    3000 |
      #| EXPLEOTester | Tester6@expleo.com  | Expleo  | 21-02-2025 |     322 |
      #| EXPLEOTester | Tester7@expleo.com  | Expleo  | 21-02-2025 |    5453 |
      #| EXPLEOTester | Tester8@expleo.com  | Expleo  | 21-02-2025 |    5465 |
      #| EXPLEOTester | Tester9@expleo.com  | Expleo  | 21-02-2025 |    6565 |
      #| EXPLEOTester | Tester10@expleo.com | Expleo  | 21-02-2025 |     232 |