@api
Feature: US_1
  Scenario: Create a Board
    Given send post request for create "kubra"
    And Assert name "kubra"
    And Assert status code 200

