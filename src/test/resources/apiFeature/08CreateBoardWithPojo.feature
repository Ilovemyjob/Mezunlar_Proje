
Feature:
  Scenario: Create_Board_POJO
    Given Post request for create "yeni" with pojo
    And get response with pojo
    And assert pojo "yeni"




