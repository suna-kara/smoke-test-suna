@sumeyye
Feature: Interacting with employees on posts
  As a user, I should be able to interact with employees on the posts.

  Scenario: Getting the environment ready for the user
    When commentator logs in
    When commentator clicks on post box
    And user writes original comment
    And user logs out

    When reviewer logs in
    And user writes review comment
    And user logs out


  Scenario: User should be able to make a comment, like, or unfollow other employees' posts.
    When user is on the login page
    When User Writes a comment on a post

    When user clicks on like
    Then a thumbs up appears on the left of the post

    When user clicks on unfollow
    Then follow must be displayed

  Scenario: User should be able to make a comment and like another reviewer's post
    When user is on the login page
    When user clicks on like on review
    Then a thumbs up appears on the right of the post

    When user clicks on reviewer's comment box
    And user writes something
    Then the comment appears on the post thread

  Scenario: User should be able to like and reply to their own comment.
    When user is on the login page
    When user clicks on like on own comment
    Then a thumbs up appears on own comment

    When user clicks on reply on own comment
    And user writes something on own comment
    Then the own comment appears on the post thread


  Scenario: After making a comment user should be able to "view comment", "copy link", "edit", "delete" and "create task"
  by clicking on "more"
    When user is on the login page
    And user clicks on more below the comment
    And user clicks on view comment
    Then user is directed to conversations page

    When user clicks on more below the comment
    And user clicks on copy link
    Then a tick appears next to the option

    When user clicks on more below the comment
    And user clicks on edit
    Then comment box opens

    When user clicks on more below the comment
    And user clicks on delete
    Then the comment disappears

    And user clicks on more below the comment
    And user clicks on create task
    Then a sign with the words task has been created appears on top right


  Scenario: User should be able to see the reviewers' names and visit their profiles by clicking on reviewers' name
    When user is on the login page
    When user clicks on reviewer's name
    Then the reviewer's name is displayed
    When user clicks on the star
    Then the star area becomes orange


