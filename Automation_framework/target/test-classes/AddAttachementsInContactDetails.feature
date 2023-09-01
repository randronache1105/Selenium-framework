Feature: Add Atachements in Contact Details

  Scenario: As a user I am able to add an attachment into my Contact Details
    Given I access https://opensource-demo.orangehrmlive.com/web/index.php/auth/login page
    When I enter login credentials with Admin and admin123
    And I press the Login button to log into my account
    And I click the My Info option from the menu
    And I click on the Contact Details link which will redirect me to the contactDetails page
    And I click the Add Attachments button
    And I add a comment for this document uploaded in the comment field
    And I press the Save button for this attachment added

