Feature: Activity Stream Page Filter And Search Functionality
  User story: As a user, I should be able to use "Filter and search" functionality on Active Stream.


  Background: For the scenarios in the feature file, user is expected to be on login page
    Given User is on the blueCRM login page

    #AC:1
  Scenario: User should be able to see default filters as "my activity, work, favorite, announcements, and workflows".
    When Users click on filter and search input box
    Then Verify filters and search box should be contain the following in order as default
      | WORK          |
      | FAVORITES     |
      | MY ACTIVITY   |
      | ANNOUNCEMENTS |
      | WORKFLOWS     |

  @mehmet
    #AC:2
  Scenario: Users should be able to add and remove fields.
    When Users click on filter and search input box
    And Users click on the add field button
    And Users add all option in search field
    Then Verify that the all options is selected
      | Date      |
      | Type      |
      | Author    |
      | To        |
      | Favorites |
      | Tag       |
      | Extranet  |
    And Users remove all option in the search field
    Then Verify that the all options is not selected
      | Date      |
      | Type      |
      | Author    |
      | To        |
      | Favorites |
      | Tag       |
      | Extranet  |

    #Ac:3
  Scenario: User should be able to search by specifying the Date.
    When Users click on filter and search input box
    And Users click on the add field button
    And Users click on the date
    And Users select one of the options they want which are inside of the date dropdown
    And Users click search button
    Then Verify filters work as expected

    #Ac:4
  #Scenario: User should be able to search by selecting single or multiple types.
    #Ac:5
  #Scenario: User should be able to save the filter.
    #Ac:6
  #Scenario: User should be able to restore the default field.
    #Ac:7
  #Scenario: User should be able to reset filters to default.




