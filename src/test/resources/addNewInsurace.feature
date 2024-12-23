Feature: Validation of New Insurace Details

  Scenario Outline: Validation of Adding New Insurance
    Given User should be in login Page
    When User Clicks the New Insurance Tab
    And User enters the "<Name>", "<Email>", "<Address>", "<Date>"
    And User Select the "<Gender>" and "<PolicyType>"
    And User select the "<SumInsured>" and "<Premium>"
    And User click the Submit button
    Then Page should show Insurance policy created successfully
    Then Validate the created policy in DashBoard page

    Examples: 
      | Name     | Email               | Address | Date       | SumInsured | Premium |
      | Tester1  | Tester1@expleo.com  | Expleo  | 21-02-2025 |     300000 |    3000 |
      | Tester2  | Tester2@expleo.com  | Expleo  | 21-02-2025 |     500000 |     423 |
      | Tester3  | Tester3@expleo.com  | Expleo  | 21-02-2025 |     300000 |     232 |
      | Tester4  | Tester4@expleo.com  | Expleo  | 21-02-2025 |     300000 |    5465 |
      | Tester5  | Tester5@expleo.com  | Expleo  | 21-02-2025 |     300000 |    3000 |
      | Tester6  | Tester6@expleo.com  | Expleo  | 21-02-2025 |     500000 |     322 |
      | Tester7  | Tester7@expleo.com  | Expleo  | 21-02-2025 |     300000 |    5453 |
      | Tester8  | Tester8@expleo.com  | Expleo  | 21-02-2025 |     300000 |    5465 |
      | Tester9  | Tester9@expleo.com  | Expleo  | 21-02-2025 |     400000 |    6565 |
      | Tester10 | Tester10@expleo.com | Expleo  | 21-02-2025 |     300000 |     232 |
