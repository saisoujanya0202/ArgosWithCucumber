Feature: As a user
  I should be able to search and get appropriate results

  @searchValid @regression @Smoke
  Scenario: Verify search using valid product or brand name
    Given  I am on home page "https://www.argos.co.uk/"
    When I click on search field and enter the term "Dress"
    And I click on search icon
    Then I should see products related to "Dress" in search results

  @searchInvalid @regression @Smoke
  Scenario: Verify search using invalid product or brand name
    Given  I am on home page "https://www.argos.co.uk/"
    When I click on search field and enter the term "chips"
    And I click on search icon
    Then I should see "invalid product" in search results