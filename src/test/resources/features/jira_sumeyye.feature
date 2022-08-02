@LUEC-490
Feature: Default

	
	@LUEC-533
	Scenario: US08 - TC00 - Getting the environment ready for execution
		Scenario: Getting the environment ready for the user
		    When commentator logs in
		    When commentator clicks on post box
		    And user writes original comment
		    And user logs out
		
		    When reviewer logs in
		    And user writes review comment
		    And user logs out	

	#US08_As a user, I should be able to interact with employees on the posts.
	#
	#1. User should be able to make a comment, like, or unfollow other employees' posts.
	@LUEC-484
	Scenario: US08 - TC01 - Commenting, liking, unfollowing others' posts
		Scenario: User should be able to make a comment, like, or unfollow other employees' posts.
		    When user is on the login page
		    When User Writes a comment on a post
		
		    When user clicks on like
		    Then a thumbs up appears on the left of the post
		
		    When user clicks on unfollow
		    Then follow must be displayed	

	#US08_As a user, I should be able to interact with employees on the posts.
	#
	#2. User should be able to like, or make comments on all other reviewers' comments.
	@LUEC-485
	Scenario: US08 - TC02 -Liking and making comments on other reviewers' comments 
		Scenario: User should be able to make a comment and like another reviewer's post
		    When user is on the login page
		    When user clicks on like on review
		    Then a thumbs up appears on the right of the post
		
		    When user clicks on reviewer's comment box
		    And user writes something
		    Then the comment appears on the post thread	

	#US08_As a user, I should be able to interact with employees on the posts.
	#
	# 
	#
	#3. User should be able to like and replay his/her own comment.
	@LUEC-486
	Scenario: US08 - TC03 - Liking and replying to own comment
		Scenario: User should be able to like and reply to their own comment.
		    When user is on the login page
		    When user clicks on like on own comment
		    Then a thumbs up appears on own comment
		
		    When user clicks on reply on own comment
		    And user writes something on own comment
		    Then the own comment appears on the post thread	

	#h4. US08_As a user, I should be able to interact with employees on the posts.
	#
	#4. After making a comment user should be able to "view comment", "copy link", "edit", "delete" and "create task"
	@LUEC-487
	Scenario: US08 - TC04 - "view comment", "copy link", "edit", "delete" and "create task"
		Scenario: After making a comment user should be able to view comment, copy link, edit, delete and create task by clicking on more
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

	#h4. US08_As a user, I should be able to interact with employees on the posts.
	#
	# 5. User should be able to see the reviewers' names and visit their profiles by clicking on reviewers' name
	@LUEC-488
	Scenario: US08 - TC05 - Checking other users' names and profiles
		Scenario: User should be able to see the reviewers' names and visit their profiles by clicking on reviewers' name
		    When user is on the login page
		    When user clicks on reviewer's name
		    Then the reviewer's name is displayed	

	#h4. US08_As a user, I should be able to interact with employees on the posts.
	# 6. User should be able to add others' posts to favourites by clicking on the Star icon.
	@LUEC-489
	Scenario: US08 - TC06 - Adding others' posts to favs
		Scenario:  User should be able to add others' posts to favourites by clicking on the Star icon.
		    When user clicks on the star
		    Then the star area becomes orange