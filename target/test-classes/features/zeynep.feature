
Feature: As a user, I should be able to upload files and pictures as messages

  Background:
    Given User is expected to login with valid credentials
    |username |hr35@cybertekschool.com|
    |password |UserUser               |



  Scenario:User should be able to upload a file by upload files and images section
    When user clicks on the send message tab
    And user clicks on the uploadFile button
    And user uploads a file from upload files and images section
    Then the uploaded file name should be displayed


  Scenario:User should be able to upload multiple files at the same time
    When user clicks on the send message tab
    And user clicks on the uploadFile button
    And user uploads more than one file by using upload files and images section
    Then the each file should be sucsessfully uploaded


  Scenario: User should be able to upload files in different formats.
    When user clicks on the send message tab
    And user clicks on the uploadFile button
    And user uploads a file in PDF format
    And user uploads a file in WORD format
    And user uploads a file in ZIP format
    Then the files should be sucsessfully uploaded


  Scenario: User should be able to upload pictures.
    When user clicks on the send message tab
    And user clicks on the uploadFile button
    And user uploads a file in JPEG format
    And user uploads a file in PNG format
    Then the files should be sucsessfully uploaded


  Scenario: User should be able to display the uploaded picture itself in Activity Stream.
    When user clicks on the send message tab
    And user clicks on the uploadFile button
    And user uploads a file in PNG format
    And user clicks the send buttonn
    Then user should be able to display the uploaded picture in Activity Stream


 Scenario: User should be able to insert the files and images into the text
   When user clicks on the send message tab
   And user clicks on the uploadFile button
   And user uploads a file from upload files and images section
   And user clicks on the insert to text button
   Then user should see the file name inside the message box

  Scenario: User should be able to allow a recipient to edit documents.
   When user clicks on the send message tab
   And user clicks on the uploadFile button
   And user uploads a file from upload files and images section
    Then user should be able to click and check the allow a recipient button

  Scenario: User should be able to remove files and images at any time before sending.
    When user clicks on the send message tab
    And user clicks on the uploadFile button
    And user uploads a file from upload files and images section
    Then user should be able to click the delete button
    Then the files should be removed after clicking the delete button


  Scenario: User should be able to rename the file before sending it
    When user clicks on the send message tab
    And user clicks on the uploadFile button
    And user uploads a file from upload files and images section
    Then user should click the rename button
    Then user should be able to rename the file by using the rename button


  Scenario: User should be able to send files to all employees
    When user clicks on the send message tab
    And user clicks on the uploadFile button
    And user uploads a file from upload files and images section
    And user clicks the send buttonn
    Then message should be sent

  Scenario: User should be able to send files to a specific employee
    When user clicks on the send message tab
    And user clicks on the uploadFile button
    And user uploads a file from upload files and images section
    And user chooses an employee in the employee list and clicks send button
    Then message should be sent to the selected employee