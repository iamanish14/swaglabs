Feature: Simple Swaglab login

  Scenario: login with valid username and password
    Given user launch the "chrome" browser
    And user navigate to the url "https://www.saucedemo.com/"
    And user enter the username as "standard_user"
    And user enter password as "secret_sauce"
    Then user click on the login button
