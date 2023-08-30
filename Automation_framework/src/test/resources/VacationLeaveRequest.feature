Feature: Add a new leave request for vacation

  Scenario: As a user I want to see all the vacation leave records for a certain period
    Given I access https://opensource-demo.orangehrmlive.com/web/index.php/auth/login  page
    When I enter login credentials with Admin and admin123
    And I press the Login button to log into my account
    And I click the Leave link from the menu
    And I select a specific period for which I want to see the records
    And I set Leave Type as US - Vacation
    And I press search button
    Then I should see all the records with all the data entered