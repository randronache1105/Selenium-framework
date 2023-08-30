Feature: Delete a record from my Contact Details

  Scenario: As a user I am able to delete a record from my Contact Details
    Given I access https://opensource-demo.orangehrmlive.com/web/index.php/auth/login page
    When I enter login credentials with Admin and admin123
    And I press the Login button to log into my account
    And I click the My Info option from the menu
    And I select the Contact Details link which will redirect me to the contactDetails page
    And I tick the checkbox to select one record saved in the Records Found section
    And I press the Delete button to delete that record
    And I press Yes to confirm this deletion
    Then I should receive a confirmation message that the record has been deleted successfully