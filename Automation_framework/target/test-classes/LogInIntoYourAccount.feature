Feature: Log in into your account with valid credentials

    Scenario: Verify that the Customer is logged in
      Given I access https://opensource-demo.orangehrmlive.com/web/index.php/auth/login page
      When I enter login credentials with Admin and admin123
      And I press the Login button to log into my account
      Then I verify that the username is displayed in the navigation bar in the right corner of the application
      Then I close the browser