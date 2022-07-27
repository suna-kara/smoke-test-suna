@US06
Feature:Assigning tasks
  User story:
  As a user, I should be able to assign tasks under Quick Navigate Menu

  Background:For the scenarios in the feature file,user is expected to be on login page
    Given user is on homepage
    And user clicks on Task

  Scenario: HR User should be able to create a "High priority" tasks with the mandatory fields.
    When  the user clicks on the High Priority check box
    Then the  High Priority check box should be selected

  Scenario: HR User should be able to assign a task to more than one user (Test with adding 3 users max.)
    When  HR user clicks on the participant section and add more button
    And the user clicks on the High Priority check box
    And HR  user adds first participant
    And HR  user adds second participant
    And HR  user adds third person
    Then users should be seen in the participant box

  Scenario: task(s) is(are) created, they can be seen on the count on the homepage under "MY TASKS" table.
    When HR user clicks on the Things  to do section after the TASK tab
    And HR user enters a Task name
    And HR user clicks on High Priority checkbox button
    And HR user clicks on SEND button
    Then Task(s) should be seen on the count under MY TASKS table

  Scenario: Checklist should be able to be added while creating a task.
    When HR user clicks on Checklist
    And HR user adds Things to do section
    And HR user selects add button
    Then HR should verify checklist add while creating a task

  Scenario: Deadline should be able to be added while creating a task.
    When HR users click on the Deadline İnputbox
    And HR users  should be able to enter a valid deadline time after the current time and doubleclick or click select button
    Then HR user should verify that the provided deadline time is displayed on the deadline inputbox.

  Scenario:Time planning function should be able to be used in the setting of deadline.
    When HR users click deadline section
    And  HR users click a valid date and time
    And HR users select the valid date and time
    And  HR users Click on the Time planning section
    And HR users click Start task on
    And HR users click valid date and time
    And HR users select valid date and time
    And HR users click Duration section
    And HR users add  "12" days
    Then HR users should see finish date automatically at Finish section
