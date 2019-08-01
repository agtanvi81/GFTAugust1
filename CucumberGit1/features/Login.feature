Feature: test login functionality of heroku app

  Scenario: login functionality with valid credentials
    Given User is on homepage
    When User enters username and password
    And Click on login button
    Then User logged in successfully
