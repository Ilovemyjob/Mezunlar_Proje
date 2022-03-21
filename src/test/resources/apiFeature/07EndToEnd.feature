@endtoend
  Feature: CRUD Operation
    Scenario: Create a Board
      Given send post request for create "emrah"
      And Assert name "emrah"
      And Assert status code 200

    Scenario: Read Board
      * User Read from the Created Board "emrah"
      * Assert id
      * Assert getRequest status code

    Scenario: Update the Board
      Given User change the name "emrah" to the "rukiye"
      And Assert name is "rukiye"

    Scenario: Create a List
      Given User create a list name as "emrah"
      And Assert status code for list is 200
      And Assert name of list is "emrah"

    Scenario: Create a Card
      Given User create a Card "my card"
      And Assert status code of card is 200
      And Assert "my card" is created

    Scenario: Delete the Board
      * User delete the created Board
      * Assert value is null
      * Assert There is no id



