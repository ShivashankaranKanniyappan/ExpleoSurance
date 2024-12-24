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
      | Name        | Email               | Address | Date       | SumInsured | Premium |
      | UITester11  | Tester1@expleo.com  | Expleo  | 21-02-2025 |     300000 |    3000 |
      | UITester21  | Tester2@expleo.com  | Expleo  | 21-02-2025 |     500000 |     423 |
      | UITester31  | Tester3@expleo.com  | Expleo  | 21-02-2025 |     300000 |     232 |
      | UITester41  | Tester4@expleo.com  | Expleo  | 21-02-2025 |     300000 |    5465 |
      | UITester51  | Tester5@expleo.com  | Expleo  | 21-02-2025 |     100000 |    3000 |
      | UITester61  | Tester6@expleo.com  | Expleo  | 21-02-2025 |     500000 |     322 |
      | UITester71  | Tester7@expleo.com  | Expleo  | 21-02-2025 |     300000 |    5453 |
      | UITester81  | Tester8@expleo.com  | Expleo  | 21-02-2025 |     300000 |    5465 |
      | UITester91  | Tester9@expleo.com  | Expleo  | 21-02-2025 |     400000 |    6565 |
      | UITester101 | Tester10@expleo.com | Expleo  | 21-02-2025 |     300000 |     232 |
