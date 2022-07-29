
Feature:send message
  User Story:
  US01_As a user, I should be able to send messages by clicking on Message tab under Active Stream


  Account is mail:helpdesk1@cybertekschool.com
  password:UserUser



    Background:User should login with correct credential
    Given user is on the library login page


  @wipEnes
  Scenario:Verify that users send a message by fiiling in the mandatory fields.
    When user clicks on the message tab
    And user clicks on the topic button
    And user writes their topic name in the Topic
    And user writes their message in the message field
    Then Verify that users send a message by fiiling in the mandatory fields



