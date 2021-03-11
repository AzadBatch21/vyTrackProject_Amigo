package com.azsdet.vytrack.Step_Definitions;

import com.azsdet.vytrack.Pages.LoginPage;
import com.azsdet.vytrack.Pages.US_10_Page;
import com.azsdet.vytrack.Utilities.BrowserUtils;
import com.azsdet.vytrack.Utilities.ConfigurationReader;
import com.azsdet.vytrack.Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US_10_StepDefinitions {
    US_10_Page us10Page = new US_10_Page();
    LoginPage loginPage = new LoginPage();

    @Given("Truck driver is already on the login page")
    public void truck_driver_is_already_on_the_login_page() {
        Driver.getDriver().get("https://app.vytrack.com/user/login");

    }


    @When("Truck driver login as {string} and {string}")
    public void truck_driver_login_as_and(String string, String string2) {
        loginPage.UserNameInput.sendKeys(ConfigurationReader.getProperty("truckDriver1"));
        loginPage.passwordInputBox.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.logInButton.click();
    }

    @Then("Truck driver can see all Vehicle Fuel information on the grid")
    public void truck_driver_can_see_all_vehicle_fuel_information_on_the_grid() {
        us10Page.fleet.click();
        us10Page.fuelLogs.click();
        String actual = us10Page.headerVFLogs.getText();
        String expected = "Vehicle Fuel Logs";
        Assert.assertTrue(actual.equals(expected));

    }

    @Then("Truck driver can create Vehicle Fuel logs")
    public void truck_driver_can_create_vehicle_fuel_logs() throws InterruptedException {

        us10Page.creatVehFuelLogs.click();
    }

    @Then("Truck driver can cancel Vehicle Fuel logs")
    public void truck_driver_can_can_cle_vehicle_fuel_logs() {

        //String expected = us10Page.headerVehFuelLogs.getText();
        // String actual = "Create Vehicle Fuel Logs";
        // Assert.assertTrue(expected.equals(actual));
        // System.out.println(actual);

    }

    @Then("Truck driver can Edit Vehicle Fuel Logs")
    public void truck_driver_can_edit_vehicle_fuel_logs() {

    }

    @Then("Truck driver can delete Vehicle Fuel Logs")
    public void truck_driver_can_delete_vehicle_fuel_logs() {

    }

    @Then("Truck driver can add attachment on Fuel Logs")
    public void truck_driver_can_add_attachment_on_fuel_logs() {

    }

    @Then("Truck driver can add event on Fuel Logs")
    public void truck_driver_can_add_event_on_fuel_logs() {

    }

    @Then("Verify that truck driver can reset the grid by clicking on Grid setting")
    public void verify_that_truck_driver_can_reset_the_grid_by_clicking_on_grid_setting() {

    }
}
