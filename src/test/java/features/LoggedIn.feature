Feature: LoggedIn User View

  Scenario: Validate user is able to view after login
    Given User navigates to the login page
    When User successfully enters the login details
   Then User should be able to View the product category page