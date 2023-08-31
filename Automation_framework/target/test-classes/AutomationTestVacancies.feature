Feature: See all vacancies record for testers

  Scenario: As a user I can see all the Automation Tester vacancies
    Given I access https://opensource-demo.orangehrmlive.com/web/index.php/auth/login page
    When I enter login credentials with Admin and admin123
    And I press the Login button to log into my account
    And I click on the Recruitment option from the menu
    And I click on the Vacancies option
    And I search for vacancies with job title as Account Assistant
    Then I should see all the records with all the data entered