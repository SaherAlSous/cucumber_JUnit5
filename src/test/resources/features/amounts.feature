Feature: Same step several amounts
  This feature is meant to check how we can manage several
  identical steps with different values without putting the
  in an example list

  Scenario: First checkout
    Given Banana price is 40 cent
    When I checkout 2 bananas
    Then The total cost is 80 cents
    And Once I reset the account, it should be 0 cents

  Scenario: Second checkout
    Given Banana price is 60 cent
    When I checkout 4 bananas
    Then The total cost is 240 cents
    And Once I reset the account, it should be 0 cents

  Scenario: Third checkout
    Given Banana price is 100 cent
    When I checkout 8 bananas
    Then The total cost is 800 cents

  @Account
  Scenario: Transfer funds from saving into checking accounts
    Given I have deposited $10 in my "Checking Account"
    And I have deposited $500 in my "Saving Account"
    When I Transfer $500 from my "Saving Account" to my "Checking Account"
    Then The balance of my "Checking Account" should be $510
    And The balance of my "Savings Account" should be $0