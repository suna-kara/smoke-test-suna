Feature:Message Box functionality
  User Story:As a user, I should be able to add link, insert video, mention, quote, add tag in message.


  Background:
    Given user login to the home page with valid credentials



#Done
  Scenario:User should be able to add mentions about only department employees.
    Given user should be displaying the "MESSAGE" tab from the top menu .
    And user  hits the message link from the top menu
    And user hover over the Add mention icon and click it
    And user hits the Employees and Departments tab
    And user add the employee from the dropdown list.
    Then  verify the mention is attached and visible
    When user clicks the send button
    Then user displays the attached mention below activity stream

#

#2#done

  Scenario: User should be able to attach link to specified text.
    Given user  hits the message link from the top menu
    And user hover over the link icon and clicks the icon
    And user passes the link text into  text input box
    And user passes the "https://www.youtube.com/watch?v=HgeWwVCatk4&t=678s" into the  link input box
    And user clicks on save button
    And user clicks the send button
    When user should verify that the link sent as a post under Activity Stream





#3Failed

  Scenario Outline:User should be able to insert YouTube and Vimeo video.
    Given user  hits the message link from the top menu
    When user hover over the insert video icon and clicks it
    And user passes the youtube "<links>"
    And user clicks on save button
    And user clicks the send button
    Then user should verify that the link video is attached under Activity Stream

    Examples: youtube links
      | links                                       |
      | https://www.youtube.com/watch?v=GnG6RPSRLCs |
      | https://www.youtube.com/watch?v=Wgyirv9juFI |

  #Failed
  Scenario Outline:User should be able to insert YouTube and Vimeo video.
    Given user  hits the message link from the top menu
    When user hover over the insert video icon and clicks it
    And user passes the youtube "<links>"
    And user clicks on save button
    And user clicks the send button
    Then user should verify that the link video is attached under Activity Stream

    Examples: vimeo links
      | links                                           |
      | https://vimeo.com/100192807                     |
      | https://vimeo.com/channels/staffpicks/731378604 |


  Scenario:User should be able to add quotes.
    Given user  hits the message link from the top menu
    When user hits the quote icon and clicks it
    And user types text into the message box
    And user hits the send button
    And user displays the attached quote below activity stream


  Scenario:User should be able to add tags in message.
    Given user  hits the message link from the top menu
    When user hits the quote icon and clicks it
    And user types text into the message box
    And user observes the tag Icon and clicks it
    And user observes the tag input box
    And user types the tag input message
    And user clicks the add button below the input box
    And user clicks the send button
    Then user displays the added tag below Activity Stream

  @Esra
  Scenario: User should be able to remove tags before sending the message
    Given user  hits the message link from the top menu
    When user hits the quote icon and clicks it
    And user types text into the message box
    And user observes the tag Icon and clicks it
    And user observes the tag input box
    And user types the tag input message
    And user clicks the add button below the input box
    And user observes the Add more tab and hits it
    And  user types the tag input message
    And user clicks the add button below the input box
    When removes the tags before sending the message
    And user hits the send button
    Then user verifies the removes tags below the Activit Stream























#2. User should be able to attach link to specified text.
#3. User should be able to insert YouTube and Vimeo video.
#4. User should be able to add quotes.
#5. User should be able to add tags in message.
#6. User should be able to remove tags before sending the message





