Feature: LoggedIn user View

  Scenario: Validate user is able to view after log in
    Given User navigates to login page
    When User enters login details
    Then User should be able to view the Product category page



