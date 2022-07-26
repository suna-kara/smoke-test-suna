Feature: Feature: Activity Stream Page Filter And Search Functionality
  User Story:As a user, I should be able to use "Filter and search" functionality on Active Stream.

  Background: For the scenarios in the feature file, user expected to be on the activity stream page
    Given user is logged in as Help Desk

  Scenario: The default filters of search box are displayed
    When user clicks on filter and search box
    Then the following default filters should be displayed
      | WORK          |
      | FAVORITES     |
      | MY ACTIVITY   |
      | ANNOUNCEMENTS |
      | WORKFLOWS     |