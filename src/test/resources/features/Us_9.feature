@9
Feature:tc_9
  Scenario:user should be able to add and delete product in the shopping list
    When User go to Amazon site
    And user hover over Sign in
    And clickt Sign In
    And write valid e mail
    And write valid Password
    And User write a Words "gift"
    And clickt first product
    And User clickt Add to lIst
    And user see success Message
    And usr should see procuct on Shopping List
    And User clickt Delete
    And user should see deleted message














