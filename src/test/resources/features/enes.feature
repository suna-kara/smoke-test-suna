@wipEnes
Feature:send message
  User Story:
  US01_As a user, I should be able to send messages by clicking on Message tab under Active Stream


  Account is mail:helpdesk1@cybertekschool.com
  password:UserUser



    Background:User should login with correct credential
    Given user is on the library login page


  Scenario:AC01-TC1Verify that users send a message by fiiling in the mandatory fields.
    When user clicks on the message tab
    And user clicks on the topic button
    And user writes their topic name in the Topic
    And user writes their message in the message field
    Then Verify that users send a message by fiiling in the mandatory fields


  Scenario:AC02-TC2Verify The message delivery should be to All employees by default and should be changeable.
    When user clicks on the message tab
    Then Verify User should be sees message delivery as all employees by default
    And User should be changeable in The message delivery
    Then Verify Message delivery must have been modified



  Scenario:AC03-TC03 Verify User should be able to cancel sending messages at any time before sending.
    When user clicks on the message tab
    And user clicks on the topic button
    And user writes their topic name in the Topic
    And user writes their message in the message field
    And That users send a message by fiiling in the mandatory fields
    And user clicks cancel button


  Scenario:AC04-TC04 Verify User should be able to delete messages after sending.
    When user clicks on the message tab
    And user clicks on the topic button
    And user writes their topic name in the Topic
    And user writes their message in the message field
    Then Verify that users send a message by fiiling in the mandatory fields
    And User click more button than click delete button
    Then Verify The message mustn't display on screen












