Feature: Add a new employee

  Scenario: As a user I am able to add a new employee
    Given I access https://opensource-demo.orangehrmlive.com/web/index.php/auth/login page
    When I enter login credentials with Admin and admin123
    And I press the Login button to log into my account
    And I click on the PIM option from the menu
    And I choose the Add Employee option
    And I add a picture
    And I enter the employee's full name in the Employee Full Name section
    And I click the Create Login Details button to make the option available
    And I add a username and password
    And I press the Save button
    Then I should be able to see the confirmation message that the comment was added successfully