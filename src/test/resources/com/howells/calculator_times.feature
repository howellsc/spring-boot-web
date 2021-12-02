Feature: Calculator Times
  As a user
  I want to use a calculator to times numbers
  So that I don't need to times myself

  Scenario Outline: Times two numbers <num1> & <num2>
    Given I have a calculator
    When I times <num1> and <num2>
    Then the result should be <total>

  Examples:
    | num1 | num2 | total |
    | -2 | 3 | -6 |
    | 10 | 15 | 150 |
    | 99 | -99 | -9801 |
    | -1 | -10 | 10 |
    |-40 | -30 | 1200 |
    |  5 |   3 |  15 |