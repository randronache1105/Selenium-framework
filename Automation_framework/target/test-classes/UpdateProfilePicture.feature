Feature: Upload a new Profile picture

  Scenario: As a user I can change my profile picture
    Given I access https://opensource-demo.orangehrmlive.com/web/index.php/auth/login page
    When I enter login credentials with Admin and admin123
    And I press the Login button to log into my account
    And I click on the My Info link on the menu which will redirect me to the PersonalDetails page
    And I click on the profile picture
    And I add a picture
    And I click the Save button
    Then I can see that my profile picture has been updated


