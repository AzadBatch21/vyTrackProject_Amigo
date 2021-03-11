Feature: Driver accessibility on Vehicle Fuel Logs
@grid
  Scenario:Truck driver should be able to access Vehicle Fuel Logs
    Given Truck driver is already on the login page
    When  Truck driver login as "<username>" and "<password>"
    Then Truck driver can see all Vehicle Fuel information on the grid
    And Truck driver can create Vehicle Fuel logs
    And Truck driver can cancel Vehicle Fuel logs
    And Truck driver can Edit Vehicle Fuel Logs
    And Truck driver can delete Vehicle Fuel Logs
    And Truck driver can add attachment on Fuel Logs
    And Truck driver can add event on Fuel Logs
    And Verify that truck driver can reset the grid by clicking on Grid setting