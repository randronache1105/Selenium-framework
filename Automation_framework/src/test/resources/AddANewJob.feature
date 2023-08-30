Feature: Add a new job in the Job Title field

  Scenario: As a user I want to add a new job
    Given I access https://opensource-demo.orangehrmlive.com/web/index.php/auth/login page
    When I enter login credentials with Admin and admin123
    And I press the Login button to log into my account
    And I click the Admin link from the menu
    And I select the Job Titles option from the Job menu dropdown
    And I click the Add button to add a new job
    And I add a name for the job in the Job Title field
    And I add a job description
    And I add a Job Specification file
    And I click the Save button to add the new job
    Then I should see the successfully updated confirmation message