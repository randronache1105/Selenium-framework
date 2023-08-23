Feature: Log in into your account

    Scenario: Access the Admin panel for a log in customer
      Given Customer navigates to the website
      And Customer login to his account
      And clicks to Admin panel
      Then Customer can see details about other users