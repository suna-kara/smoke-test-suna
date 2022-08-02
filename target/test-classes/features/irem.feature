Feature: add features in message

  User Story:
  As a user,I should be able to add link, insert video, mention, quote, add tag in message.

  Account is mail:helpdesk1@cybertekschool.com
  password:UserUser

  @wip @irem
  Scenario: As a user, Users should be add mentions only depertmant employess
    Given User should login with correct credential
    When User, Should be click Add Mention button.
    And User should be click Emmployess and departments button
    Then User should be add deparmants employess
    Then Verification The chosen departments employess should be see in

    @wip @irem
    @smoke
    Scenario:As a User, Users should be able to add a link to the typed text
      Given User should login with correct credential
      When Users should click link button and should be able to write the "Amazon" and "https://www.amazon.com/"
      And User,After write a link, should click save button
      Then Verification Users should click send button and user should be see in message