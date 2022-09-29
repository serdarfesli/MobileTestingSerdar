
Feature: As a user I should be able to login

  Scenario: User logins as student with correct credentials
    When user is on the login page
    And user enters correct username
    And user enters correct password
    And user clicks login button
    Then user successfully logins and lands on home page

