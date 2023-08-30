Feature: Want to see all records in Pending Approval for CAN-Personal

  Scenario: As a user I want to see leave records with Pending Approval status for an employee, and then reset the entered data
    Given I access https://opensource-demo.orangehrmlive.com/web/index.php/auth/login page
    When I enter login credentials with Admin and admin123
    And I press the Login button to log into my account
    And I click the Leave link from the menu
    And I select a period from 2021-12-01 to 2023-12-31
    And I select Leave Type as CAN - Personal
    And I enter Anthony Nolan in the Employee Name field
    And I press search button
    And I click on the Reset button
    Then I should see a pop-up message that says no records found