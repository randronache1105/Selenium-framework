Feature: As a user I want to update street and country details

  Scenario: Update street name and country
    Given I access https://opensource-demo.orangehrmlive.com/web/index.php/auth/login page
    When I enter login credentials with Admin and admin123
    And I press the Login button to log into my account
    And I click the My Info option from the menu
    And I click on the Contact Details link which will redirect me to the contactDetails page
    And I update the Street 1 field from contact details
    And I select Algeria as country
    And I press the Save button
    Then I should see the successfully updated confirmation message