Feature: As a user
  I should be able to login

  @loginValid @regression @Smoke
  Scenario: Verify User is able to login with valid details
    Given  I am on page  "https://www.argos.co.uk/account/login?clickOrigin=header:home:account"
    When I click on My email field and enter the term "saisoujanya0202@gmail.com"
    And I click on My password field and enter the term "Happy@1"
    And I click on button SING IN SECURELY
    Then I should login successfully