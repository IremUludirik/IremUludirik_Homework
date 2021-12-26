Feature: Watpadd login scenarios

  Background:
    Given Wattpad apk opened
    And First login button tapped


  @Negative
  Scenario Outline: Wrong password
    When "userdenemeuser1" entered
    And wrong "<passwordLog>" entered
    And login button tapped
    Then error box came
    And apk was closed
    Examples:
      | passwordLog |
      | 1           |
      | 322         |
      | 956         |


  @Positive
  Scenario: Forgot password
    When forgot password button tapped
    And "userdenemeuser1" entered for reset password
    And send email button tapped
    Then assent box came
    And apk was closed

