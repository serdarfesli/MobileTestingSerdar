
Feature: As a user I should be able to login

  Scenario: User logins as student with correct credentials
    When user is on the login page
    And user enters correct phoneNumber
    And user enters correct password
    And user clicks login button
    Then user successfully logins and lands on home page

Scenario: User gets "Uyarı, Geçerli bir telefon numarası ve şifre girin" message if he logs in with empty phoneNumber
  When user is on the login page
  And user enters correct password
  And user clicks login button
  Then user see "Uyarı, Geçerli bir telefon numarası ve şifre girin" warning message

  Scenario: User gets "Uyarı, Geçerli bir telefon numarası ve şifre girin" message if he logs in with empty password
    When user is on the login page
    And user enters correct phoneNumber
    And user clicks login button
    Then user see "Uyarı, Geçerli bir telefon numarası ve şifre girin" warning message

  Scenario: User gets "Uyarı, Geçerli bir telefon numarası ve şifre girin" message if he logs in with empty phoneNumber and empty password
    When user is on the login page
    And user clicks login button
    Then user see "Uyarı, Geçerli bir telefon numarası ve şifre girin" warning message



  Scenario: User gets "Uyarı, Geçerli bir telefon numarası ve şifre girin" message if he logs in with correct phoneNumber and wrong password
    When user is on the login page
    And user enters correct phoneNumber
    And user enters wrong password
    And user clicks login button
    Then user see "Uyarı, Geçerli bir telefon numarası ve şifre girin" warning message

  Scenario: User gets "Uyarı, Geçerli bir telefon numarası ve şifre girin" message if he logs in with wrong phoneNumber and correct password
    When user is on the login page
    And user enters wrong phoneNumber
    And user enters correct password
    And user clicks login button
    Then user see "Uyarı, Geçerli bir telefon numarası ve şifre girin" warning message

  Scenario: User gets "Uyarı, Geçerli bir telefon numarası ve şifre girin" message if he logs in with wrong phoneNumber and wrong password
    When user is on the login page
    And user enters wrong phoneNumber
    And user enters wrong password
    And user clicks login button
    Then user see "Uyarı, Geçerli bir telefon numarası ve şifre girin" warning message