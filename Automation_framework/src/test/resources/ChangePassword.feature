Feature:Change password as a user

  Background:
    Given I access https://opensource-demo.orangehrmlive.com/web/index.php/auth/login page
    When I enter login credentials with Admin and admin123
    And I press the Login button to log into my account
    And I select the Change Password option from drop-down user profile menu
    Then I verify PIM page

  Scenario: As a user I am able to change my password
    And I enter the current password in the Current Password field
    And I enter in the Password field a new password
    And I confirm the new password
    And I press the Save button to update the password
    Then I should be able to see the confirmation message