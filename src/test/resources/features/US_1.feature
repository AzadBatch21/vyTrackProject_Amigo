@wip
Feature: Truck driver login feature


  Background: Authorized user is already on the login page


  Scenario Outline: Truck driver Login accessibility

    Given truck driver login as "<username>" and "<password>"
    Then truck driver should be able to see four modules
      | Fleet      |
      | Customers  |
      | Activities |
      | System     |


    Examples:
      | username     | password |
      | truckDriver1 | password |
      | truckDriver2 | password |
      | truckDriver3 | password |


  Scenario Outline: Truck driver Login accessibility
    Given store manager or sales manager login as "<username>" and "<password>"
    Then store manager or sales manager should be able to see eight modules
      | Dashboards         |
      | Fleet             |
      | Customers         |
      | Sales             |
      | Activities        |
      | Marketing         |
      | Reports & Segments |
      | System            |

    Examples:
      | username      | password |
      | storeManager1 | password |
      | storeManager2 | password |
      | salesManager1 | password |
      | salesManager2 | password |


