Feature:

 Background: User already on the login page

 @ariz1
  Scenario Outline: Truck driver Login accessibility
    Given store manager or sales manager login as "<username>" and "<password>"
    Given that Store manager or Sales manager can access Vehicle Costs page.
    When  Store manager or sales manager can create Vehicle cost,
    And   store manager or sales manager can delete the costs,
    And   store manager or sales manager can edit the costs,
    And   store manager or sales manager can add attachment,
    And   store manager or sales manager can add note,
    And   store manager or sales manager can add event,
    Then  store manager or sales manager can reset the grid by click on Grit setting.

    Examples:
      | username      | password |
      | storeManager1 | password |
      | storeManager2 | password |
      | salesManager1 | password |
      | salesManager2 | password |



