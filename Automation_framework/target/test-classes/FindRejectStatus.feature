Feature: Log in into your account with valid credentials

  Scenario: Verify that the Customer is logged in
    Given I access https://opensource-demo.orangehrmlive.com/web/index.php/auth/login page
    When I enter login credentials with Admin and admin123
    And I press the Login button to log into my account
    And I click the Leave link from the menu
    Then I verify Leave page
    And I select the Rejected status from the 'Show Leave with Status' section
    Then I check that the Rejected status is present as a selection by using XPath selector