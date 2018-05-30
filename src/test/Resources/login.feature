Feature: LogIn
  As an end user
  I want to login
  So that I can get login

  Scenario Outline: LogIn as a registered user

    Given I am a registered user on the home page
    When I click on SignIn button
    Then I should be able to go on Login page
    When I enter  MyEmailAddress field as "<EmailID>" and MyPassword field as "<MyPassword>"
    And I click on  submit button
    Then I should be able to login
    Examples:
      | EmailID                    | MyPassword |
      | vasanivijaykumar@gmail.com | dharini1   |

#  Scenario Outline: LogIn as a invalid user
#    Given I am  on the home page as not registered user
#    When I click on SignIn button
#    Then I should be able to go on Login page
#    When I enter  MyEmailAddress field as "<EmailID>" and MyPassword field as "<MyPassword>"
#    And I click on  submit button
#    Then I should be failed to login
#    And  I should get error Login  message
#    Examples:
#      | EmailID     | MyPassword |
#      | RandomEmail | 12345      |






