Feature: First feature
  for testing cucumber

  Scenario: Summing two numbers
    Given Print start log
    When I add 2 and 5
    Then Result is 7

  Scenario Outline: Summing two numbers
    Given Print start log
    When I add <num1> and <num2>
    Then Result is <result>
    Examples:
      | num1 | num2 | result |
      | 1    | 2    | 3      |
      | 0    | 4    | 4      |