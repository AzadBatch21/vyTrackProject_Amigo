Feature: As a truck driver I should be able to access
  Vehicle Costs page


  Scenario: TC1: Being able to click Vehicle Costs page
    Given truck driver login as "<username>" and "<password>"
    Then driver can click Fleet module on the homepage
    Then driver should click Vehicle Costs page
    And driver should see Create Vehicle Costs on the right top and click

  @US3_Aliya
  Scenario: TC2: Creating new Vehicle Costs page
    Given driver can click Fleet module on the homepage
    Then driver should click Vehicle Costs page
    Then driver should see Create Vehicle Costs on the right top and click
    When driver should choose value from dropdown in Type input box
    Then driver should enter only amount on Total price box
    And driver should choose date from calendar
    Then driver should write description on Cost Description box
    And driver should click add button on the right
    And driver should be able to click any Chassis number checkbox and click Select
    And driver should be able to click any License plate checkbox and click Select
    Then driver should see and click Save button on the right top

  Scenario: TC3: Delete functionality In Vehicle Costs page
    Given driver can click Fleet module on the homepage
    Then driver should click Vehicle Costs page
    Then driver should see Vehicle Costs on the right top and click
    When driver should see Delete button on top and be able to click
    Then driver should see "Delete Confirmation" message
    And driver be able to click "Yes, Delete"


  Scenario: TC4: Edit functionality In Vehicle Costs page
    Given driver can click Fleet module on the homepage
    Then driver should click Vehicle Costs page
    Then driver should see Vehicle Costs on the right top and click
    When driver should see Edit button on top and be able to click
    Then driver should to type in Value box
    And driver should see "Save and Close" button and click


