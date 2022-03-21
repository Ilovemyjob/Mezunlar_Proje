

Feature:
  Scenario: Create a Card
    Given User create a Card "my card"
    And Assert status code of card is 200
    And Assert "my card" is created


