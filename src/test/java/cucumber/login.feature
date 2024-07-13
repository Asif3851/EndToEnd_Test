@tag
Feature: Testing of login funtionality
  I want to use this template for my feature file

  @tag2
  Scenario Outline: User Login with Valid Credentials
    Given login page url
    When login use username <name> and Password <pass>
    Then Login sucsessful

    Examples: 
      | name           | pass      |
      | aa@example.com | Aliasif9@ |
      | aasbbb         | Aliaskf9@ |
