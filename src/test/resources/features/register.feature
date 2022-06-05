Feature: As new user 
  I should be able to register with their details

  Background:
    Given I am on page  "https://www.argos.co.uk/account/login?clickOrigin=header:home:account"


  Scenario: Verify User is able to Register with valid details

    When I click on "Register" link
    And I click on My email field and enter the term "saisoujanya10@gmail.com"
    And I click on button CONTINUE
    And I select "Mrs" for Title field
    And I click on FirstName field and enter the term "Surendra"
    And I click on LastName field and enter the term "Soujanya"
    And I click on Mobile number field and enter the number "07397317726"
    And I click on Postcode field and enter the text "SW28 0JW"
    And I click on button SAVE AND CONTINUE




