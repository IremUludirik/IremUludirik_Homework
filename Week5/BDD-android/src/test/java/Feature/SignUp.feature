Feature: Watpadd sign up scenarios

  Background:
    Given Wattpad opened
    And Join for free button tapped


  @Negative
  Scenario Outline: Use of username containing inappropriate characters
    When "<emailNeg>" email entered
    And "<usernameNeg>" containing inappropriate characters entered
    And "<passwordNeg>" password entered
    And error image came
    Then error message came
    And apk closed
    Examples:
      | emailNeg                         | usernameNeg     | passwordNeg        |
      | user.meu123@gmail.com            | %&usereme123qwe | %&userdeneme123qwe |
      | user.deneme.robdegilim@gmail.com | 4322gfa$*]{     | sdasdasd           |
      | user.deneme.usr1@gmail.com       | !!??$2586#f     | oltgrfde2345**]{   |


  @Positive
  Scenario Outline: Successfully sign up
    When "<emailPos>" entered for successfully sign up with email
    And "<usernamePos>" entered for successfully sign up with username
    And "<passwordPos>" entered for successfully sign up with password
    And birthday entered
    And birthday fixed
    And birthday setted
    And start button tapped
    Then welcome title came
    And apk closed
  #her calistirmada, email ve username degismeli. Uye olduktan sonra ayni email ve username kullanilamiyor.
  #username max.20 karakterli olmali.
    Examples:
      | emailPos                               | usernamePos        | passwordPos        |
      | userusr3_bootcamp6512@gmail.com        | usr65_bootcamp6512 | %&userdeneme123qwe |
      | usrrobotdegilim_bootcamp6512@gmail.com | usr51_bootcamp6512 | 123234dfdc         |
      | userusr123_bootcamp6512@gmail.com      | usr12_bootcamp6512 | ooooooofofoofof    |
