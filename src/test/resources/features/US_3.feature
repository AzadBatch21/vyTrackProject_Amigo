
Feature: As a truck driver I should be able to access
  Vehicle Odometer page


Scenario: TC1: Being able to click Vehicle Odometer page
Given truck driver login as "<username>" and "<password>"
Then driver can click Fleet module on the homepage
Then driver should click Vehicle Odometer page
And driver should see "Create Odometer" on the right top and click


Scenario: TC2: Creating new Vehicle Odometer page
  Given driver can click Fleet module on the homepage
  Then driver should click Vehicle Odometer page
Then driver should see "Create Odometer" on the right top and click
When driver should put value inside Value box
Then driver should choose date from calendar
And driver should put name on name box
And driver should choose unit from dropdown
And driver should type and choose from dropdown vehicle module
And driver should click add button on the right
And driver should be able to click any License plate checkbox and click Select
Then driver should see and click Save button on the right top


Scenario: TC3: Delete functionality In Odometer page
  Given driver can click Fleet module on the homepage
  Then driver should click Vehicle Odometer page
  Then driver should see "Create Odometer" on the right top and click
When driver should see Delete button on top and be able to click
Then driver should see "Delete Confirmation" message
And driver be able to click "Yes, Delete"

  @US3_Aliya
Scenario: TC4: Edit functionality In Odometer page
  Given driver can click Fleet module on the homepage
  Then driver should click Vehicle Odometer page
  Then driver should see "Create Odometer" on the right top and click
When driver should see Edit button on top and be able to click
Then driver should to type in Value box
And driver should see "Save and Close" button and click