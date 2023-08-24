Feature: Login into HRM app

  Scenario: As a user of HRM app I should be able to login into the application
    Given I access webpage
    When I introduce the correct username
    And I introduce the correct password
    And I click on the log in button
    Then I should be able to proceed to the Dashboard
    And I should be able to check my actions tab

