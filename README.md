# BehaviourDrivenDevelopment-poc
POC for BDD with help of Cucumber (https://cucumber.io/)

# Acceptance Test

*First, the developers, testers and business folks explore the problem domain, and collaborate to produce concrete examples that describe the behaviour they want.*
**Sample Behavior File**
```
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

    Scenario Outline: Login Functionality for Facebook
      Given user navigate to Facebook via chrome
      When user enter UserName as "<username>" and password as "<password>"
      Then login should be unsuccessful
      Examples:
        | username  | password  |
        | username1 | password1 |
        | username2 | password2 |

    Scenario:
      Given user navigate to Facebook via chrome
      When user enter UserName as "<username>" and password as "<password>"
      Then the user should be redirected to login retry
      
```
*Next, the team use* **Cucumber** *to run those examples as automated acceptance tests.*

# Run Acceptance Tests (approaches):

```
gradle cucumber
```
*Another Approach*
```
Right Click on Feature File and Run it 
```
