Feature: Simple Calculator Application

  Background: I have a Calculator
    Given Calculator is turned on

    Scenario Outline: Addition
      When I add <first>
      And add <second>
      Then result should be <result>
      Examples:
      | first | second | result |
      | 3     | 5      |  8     |
      | 2     | 1      |  3     |
      | 6     | 2      |  8     |

    Scenario Outline: Subtraction
      When I add <first>
      And subtract <second>
      Then result should be <result>
      Examples:
        | first | second | result |
        | 10    | 5      |  5     |
        | 9     | 6      |  3     |
        | 10    | 2      |  8     |

    Scenario: Combination of Addition and Subtraction
      When I add 10
      And subtract 5
      And add 5.5
      Then result should be 10.5