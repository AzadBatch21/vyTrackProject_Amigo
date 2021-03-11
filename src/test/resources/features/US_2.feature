@test
Feature: Truck driver login feature


  Background: Authorized user is already on the login page

  Scenario Outline: Truck driver Login accessibility
    Given store manager or sales manager login as "<username>" and "<password>"
    When store manager or sales manager navigates to Vehicle module
    Then store manager or sales manager should be to see all vehicle info on vehicle page
      |All Cars|
    When store manager or sales manager clicks on create car
    Then store manager or sales manager should be able to create and cancel a car
    Examples:
      | username      | password |
      | storeManager1 | password |
      | storeManager2 | password |
      | salesManager1 | password |
      | salesManager2 | password |

    # new class created
  #1234



