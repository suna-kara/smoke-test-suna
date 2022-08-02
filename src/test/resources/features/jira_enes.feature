@LUEC-532
Feature: Default

	Background:
		#@LUEC-522
		Given user is on the library login page
		

	#*{color:#de350b}User Story:{color}*
	#
	#US01_As a user, I should be able to send messages by clicking on Message tab under Active Stream
	#
	#{color:#de350b}*AC:*{color}
	#
	#1. User should be able to send a message by filling in the mandatory fields.
	@LUEC-524
	Scenario: Users send a message by fiiling in the mandatory fields.
		When user clicks on the message tab
		    And user clicks on the topic button
		    And user writes their topic name in the Topic
		    And user writes their message in the message field
		    Then Verify that users send a message by fiiling in the mandatory fields	

	#*{color:#de350b}User Story:{color}*
	#
	#US01_As a user, I should be able to send messages by clicking on Message tab under Active Stream
	#
	#{color:#de350b}{*}AC: 2{*}.{color}
	#
	#{color:#172b4d} The message delivery should be to 'All employees' by default and should be changeable.{color}
	@LUEC-525
	Scenario: The message delivery should be to All employees by default and should be changeable.
		When user clicks on the message tab
		    Then Verify User should be sees message delivery as all employees by default
		    And User should be changeable in The message delivery
		    Then Verify Message delivery must have been modified	

	#*{color:#de350b}User Story:{color}*
	#
	#US01_As a user, I should be able to send messages by clicking on Message tab under Active Stream
	#
	#{color:#de350b}*AC:*{color}
	#
	#3. User should be able to cancel sending messages at any time before sending.
	#
	# 
	@LUEC-527
	Scenario: User should be able to cancel sending messages at any time before sending.
		When user clicks on the message tab
		    And user clicks on the topic button
		    And user writes their topic name in the Topic
		    And user writes their message in the message field
		    And That users send a message by fiiling in the mandatory fields
		    And user clicks cancel button	

	#*{color:#de350b}User Story:{color}*
	#
	#US01_As a user, I should be able to send messages by clicking on Message tab under Active Stream
	#
	#*{color:#de350b}AC:{color}*
	#4. User should be able to delete messages after sending.
	# 
	#
	# 
	@LUEC-529
	Scenario: User should be able to delete messages after sending.
		When user clicks on the message tab
		    And user clicks on the topic button
		    And user writes their topic name in the Topic
		    And user writes their message in the message field
		    Then Verify that users send a message by fiiling in the mandatory fields
		    And User click more button than click delete button
		    Then Verify The message mustn't display on screen