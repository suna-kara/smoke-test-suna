
@wip
Feature: Interacting with employees on posts
  As a user, I should be able to interact with employees on the posts.


  Background: For the scenarios in this feature file, user is expected to be on login page
    Given user is on the library login page


  Scenario: User should be able to make a comment, like, or unfollow other employees' posts.

    When user goes to a post
    And user clicks on like
    Then a thumbs up appears on the right of the post

    When user goes to a post
    And user clicks on unfollow
    Then follow must be displayed

    When user goes to a post
    And user clicks on the comment box
    And user writes something
    And user clicks on send
    Then the comment appears on the post thread


  Scenario: User should be able to make a comment and like another reviewer's post

    When user goes to a review
    And user clicks on like
    Then a thumbs up appears on the right of the post

    When user goes to a review
    And user clicks on reply
    And user writes something
    And user clicks on send
    Then the comment appears on the post thread


  Scenario: User should be able to like and reply to their own comment.

    When user goes to a post
    And user clicks on the comment box
    And user writes something
    And user clicks on send
    And user clicks on like
    Then a thumbs up appears on the right of the post

    When user goes to a post
    And user clicks on the comment box
    And user writes something
    And user clicks on send
    And user clicks on reply
    And user writes something
    And user clicks on send
    Then the comment appears on the post thread


  Scenario: After making a comment user should be able to "view comment", "copy link", "edit", "delete" and "create task"
  by clicking on "more"

    When user goes to a post
    And user clicks on the comment box
    And user writes something
    And user clicks on send
    And user clicks on more below the comment
    And user clicks on view comment
    Then user is directed to conversations page

    When user goes to a post
    And user clicks on the comment box
    And user writes something
    And user clicks on send
    And user clicks on more below the comment
    And user clicks on copy link
    Then a tick appears next to the option

    When user goes to a post
    And user clicks on the comment box
    And user writes something
    And user clicks on send
    And user clicks on more below the comment
    And user clicks on edit
    Then comment box opens
    And user writes something
    And user clicks on send
    Then the comment appears on the post thread

    When user goes to a post
    And user clicks on the comment box
    And user writes something
    And user clicks on send
    And user clicks on more below the comment
    And user clicks on delete
    Then the comment disappears

    When user goes to a post
    And user clicks on the comment box
    And user writes something
    And user clicks on send
    And user clicks on more below the comment
    And user clicks on create task
    Then a sign with the words task has been created appears on top right


  Scenario: User should be able to see the reviewers' names and visit their profiles by clicking on reviewers' name
    When user goes to a post
    Then the reviewer's name is displayed
      And user clicks on the star
      Then the star area becomes orange