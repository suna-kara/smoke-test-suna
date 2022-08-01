@LUEC-498
Feature: Default

	Background:
		#@LUEC-492
		   Given user is logged in as Help Desk
		

	#AC1. User should be able to see default filters as "my activity, work, favorite, announcements, and workflows"
	@LUEC-491
	Scenario: The default filters of search box are displayed
		When user clicks on filter and search box
		    Then the following default filters should be displayed
		      | WORK          |
		      | FAVORITES     |
		      | MY ACTIVITY   |
		      | ANNOUNCEMENTS |
		      | WORKFLOWS     |	

	#AC2. User should be able to add fields.
	@LUEC-493
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

	#AC2. User should be able to add and remove fields.
	@LUEC-494
	Scenario Outline: Removing field name from search field
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

	#AC5. User should be able to save the filter.
	@LUEC-495
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

	#AC6. User should be able to restore the default field,
	@LUEC-496
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

	#AC7. User should be able to reset filters to default.
	@LUEC-497
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