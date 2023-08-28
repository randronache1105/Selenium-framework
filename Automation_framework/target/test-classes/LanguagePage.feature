Feature: Add a new language package

  Scenario: As a user I am able to add a new language Package
    Given I access https://opensource-demo.orangehrmlive.com/web/index.php/auth/login page
    When I enter login credentials with Admin and admin123
    And I press the Login button to log into my account
    And I click the Admin link from the menu
    And I click on the Configuration dropdown menu button
    And I click on the Language Packages option
    And I click the Add button to add a new language to the packages
    And I select the language Colognian(Germany) from that list
    And I press the Save to add this new language to my packages
    #Then I should be redirected to the Language Packages page

