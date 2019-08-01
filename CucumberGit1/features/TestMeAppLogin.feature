Feature: login functionality demowebshop

  Scenario Outline: multiple login functionality
    Given user is on webshop page
    When user enters "<username>" and "<password>"
    And user clicks on login button
    Then display message logged in successfully and logout

    Examples: 
      | username           | password  |
      | pratiksha@test.com | pratiksha |
      | rick@test.com      | tester    |
