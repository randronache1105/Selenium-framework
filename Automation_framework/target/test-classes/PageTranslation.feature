Feature: Access translate page for Spanish

  Scenario: The user accesses page translation
    Given I access https://opensource-demo.orangehrmlive.com  page
    When I enter login credentials with Admin and admin123
    And I press the Login button to log into my account
    And I click the Admin link from the menu
    And I click on the Configuration dropdown menu button
    And I click on the Language Packages option
    And I click on the Translate button for Spanish - Español language package
    Then I should be redirected to the languageCustomization page

