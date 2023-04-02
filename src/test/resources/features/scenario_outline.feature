Feature: Working on Scenario Outline

  Scenario Outline: Withdraw fixed amount
    Given I have <Balance> in my account
    When I choose to withdraw the fixed amount of <Withdrawal>
    Then I should <OutCome>
    And the balance of my account now should be <Remaining>

    Examples: Successful withdrawal
      | Balance | Withdrawal  | OutCome              | Remaining  |
      |  $500   |     $50     | receive $50 cash     |    $450    |
      |  $500   |     $100    | receive $100 cash    |    $400    |


    Examples: Attempt to withdraw too much
      | Balance | Withdrawal  | OutCome              | Remaining  |
      |  $100   |     $200    | see an error message |    $100    |
      |   $0    |     $50     | see an error message |     $0     |