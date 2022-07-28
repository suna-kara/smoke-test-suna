@mehmet
Feature: Activity Stream Page Filter And Search Functionality
  User story: As a user, I should be able to use "Filter and search" functionality on Active Stream.


  Background: For the scenarios in the feature file, user is expected to be on login page
    Given User is on the blueCRM login page

  Scenario: User should be able to see default filters as "my activity, work, favorite, announcements, and workflows".
    When Users click on filter and search input box
    Then Verify filters and search box should be contain the following in order as default
      | WORK          |
      | FAVORITES     |
      | MY ACTIVITY   |
      | ANNOUNCEMENTS |
      | WORKFLOWS     |
      | AYŞE          |

  #Scenario: User should be able to add and remove fields.
    #When Users click on filter and search input box