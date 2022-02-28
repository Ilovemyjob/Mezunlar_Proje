@6
Feature:tc_6
  Scenario:User should be able to choose random products and add to cart. You should see that the total price of the added products and the total in the basket are the same.

    When User go to Amazon site
    And user hover over Sign in
    And clickt Sign In
    And write valid e mail
    And write valid Password
    And User clickt search buttom
    And User write a Words "Samsung"
    And clickt first product
    And clickt Add to card
    And User write a Words "Apple"
    And clickt second product
    And clickt Add to card
    And go to Shopping list
    And User should see selected product correctly












