Feature: See Employee record

  Scenario: As a user I can access an employee's records
    Given I access https://opensource-demo.orangehrmlive.com/web/index.php/auth/login page
    When I enter login credentials with Admin and admin123
    And I press the Login button to log into my account
    And I click on the Maintenance option from the menu which will redirect me to the purgeEmployee page
    And I enter my password to validate my administrator credentials
    And I click the Confirm button
    And I click on the Access Records option
    And I enter Anthony Anadebe in the Employee Name field
    And click on the Search button
    Then I can see that the employee ID is displayed in the Selected Employee section by using css selector