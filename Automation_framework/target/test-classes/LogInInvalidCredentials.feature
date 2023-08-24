Feature: Log in into Customer account with invalid credentials

  Scenario Outline: Use invalid credentials for Customer account
    Given I access <URL> page
    When I enter invalid login credentials with <username> and <password>
    And I press the Login button to log into my account
    Then I verify that an appropriate message is displayed for invalid credentials
    Then I close the browser

    Examples:
    |URL  | username        | password |
    | https://opensource-demo.orangehrmlive.com/web/index.php/auth/login | invalidUsername | admin123 |
    | https://www.google.ro/?hl=ro | efef            | 121      |