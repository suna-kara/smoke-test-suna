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