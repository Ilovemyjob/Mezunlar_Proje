@4
Feature:tc_4
  Scenario: when user search for a product,user should see all searched words
    When User go to Amazon site
    And User clickt search buttom
    And User write a Words "Samsung"
    And User see searched word "Samsung" in all options






