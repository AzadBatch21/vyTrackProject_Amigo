package com.azsdet.vytrack.Step_Definitions;

import com.azsdet.vytrack.Pages.LoginPage;
import com.azsdet.vytrack.Pages.VehicleCostsPage;
import com.azsdet.vytrack.Utilities.BrowserUtils;
import com.azsdet.vytrack.Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class US_6_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    VehicleCostsPage vehicleCostsPage =new VehicleCostsPage();

    @Given("that Store manager or Sales manager can access Vehicle Costs page.")
    public void that_store_manager_or_sales_manager_can_access_vehicle_costs_page() {

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(vehicleCostsPage.fleet).moveToElement(vehicleCostsPage.vehicleCostsPage).click().perform();
        BrowserUtils.wait(5);
    }

    @When("Store manager or sales manager can create Vehicle cost,")
    public void store_manager_or_sales_manager_can_create_vehicle_cost() {

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(vehicleCostsPage.createVehicleCost).click().perform();
        BrowserUtils.wait(5);




        
    }

//added
    @And("store manager or sales manager can delete the costs,")
    public void store_manager_or_sales_manager_can_delete_the_costs() {

    }

    @And("store manager or sales manager can edit the costs,")
    public void store_manager_or_sales_manager_can_edit_the_costs() {

    }

    @And("store manager or sales manager can add attachment,")
    public void store_manager_or_sales_manager_can_add_attachment() {

    }

    @And("store manager or sales manager can add note,")
    public void store_manager_or_sales_manager_can_add_note() {

    }

    @And("store manager or sales manager can add event,")
    public void store_manager_or_sales_manager_can_add_event() {

    }

    @Then("store manager or sales manager can reset the grid by click on Grit setting.")
    public void store_manager_or_sales_manager_can_reset_the_grid_by_click_on_grit_setting() {

    }
}
