
Feature: Activity Stream Page Filter And Search Functionality
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

  Scenario Outline: Adding field name to search field
    When user clicks on filter and search box
    And user clicks on the add field button
    And user adds "<fieldName>" search field
    Then Verify the "<fieldName>" should be added to search field
    Examples:
      | fieldName |
      | Date      |
      | Type      |
      | Author    |
      | To        |
      | Favorites |
      | Tag       |
      | Extranet  |


  Scenario Outline: Removing fieldName from search field
    When user clicks on filter and search box
    And user clicks on the add field button
    And user removes "<fieldName>" from search field
    Then the "<fieldName>" should be removed
    Examples:
      | fieldName |
      | Date      |
      | Type      |
      | Author    |
      | To        |
      | Favorites |
      | Tag       |
      | Extranet  |


  Scenario Outline: User can add filters
    When  user clicks on filter and search box
    And user clicks on the save filter button
    And user enters new "<filterName>"
    And user clicks on the save button
    Then the "<filterName>" should be added
    Examples:
      | filterName |
      | MY FILTER1 |
      | MY FILTER2 |
      | MY FILTER3 |


  Scenario: Restoring the default field
    When user clicks on filter and search box
    And user clicks on the add field button
    And user clicks on "Date" option
    And user clicks on restore default fields link
    Then the following default search fields should be selected
      | Date   |
      | Type   |
      | Author |
      | To     |

  @harun
  Scenario: Resetting search filters to default
    When user clicks on filter and search box
    And user clicks on the configure filters button
    And user deletes the work filter
    And user clicks on the save button
    And user clicks on the configure filters button
    And user clicks on reset to default button
    And user clicks on the continue button
    Then the following default filters should be displayed
      | WORK          |
      | FAVORITES     |
      | MY ACTIVITY   |
      | ANNOUNCEMENTS |
      | WORKFLOWS     |