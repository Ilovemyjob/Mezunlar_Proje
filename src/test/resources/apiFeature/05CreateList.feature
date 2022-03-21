@api
Feature:
Scenario: Create a List
Given User create a list name as "emrah"
And Assert status code for list is 200
And Assert name of list is "emrah"