Feature: Checkout

  Background: We have a Checkout class and item prices
    Given A checkout class
    And the price of a "banana" is 40 cents

  Scenario Outline: Checkout a Banana
    When I checkout <count> "banana"
    Then the total price should be <total> cents

    Examples: Checkout scenarios
    |  count  |  total  |
    |    1    |   40    |
    |    2    |   80    |
    |    4    |   160   |

  Scenario: Two Bananas scanned separately
    When I checked out 1 banana
    And I checked out 1 banana
    Then total price should be 80 cents

  Scenario: A banana and an Apple
    Given the price of an apple is 24 cent
    When I check out 1 banana
    And i checkout 1 apple
    Then my total price should be 64 cents

  Scenario: Removing items from list
    When I check 4 bananas
    And remove 2 bananas later
    Then I should have a total of 80 cents