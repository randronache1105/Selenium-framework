Feature: Log in into Customer account with invalid credentials

  Scenario Outline: Use invalid credentials for Customer account
    Given I access https://opensource-demo.orangehrmlive.com/web/index.php/auth/login page
    When I enter invalid login credentials with <username> and <password>
    And I press the Login button to log into my account
    Then I verify that an appropriate message is displayed for invalid credentials
    Then I close the browser

    Examples:
      | username        | password |
      | invalidUsername | admin123 |
      | efef            | 121      |