Feature: Create asynchronous test with cucumber and coroutines

  Scenario Outline: Get the right calculation result
    Given I have a specific <Number>
    When I add it to <Another> number
    Then I should get the <Result>

    Examples: Adding numbers
    | Number | Another | Result |
    |   5    |    5    |   10   |
    |   8    |    3    |   11   |
    |   4    |    3    |    7   |
    |   9    |    7    |   16   |