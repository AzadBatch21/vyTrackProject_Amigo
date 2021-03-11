package com.azsdet.vytrack.Step_Definitions;

import com.azsdet.vytrack.Pages.LoginPage;
import com.azsdet.vytrack.Utilities.ConfigurationReader;
import com.azsdet.vytrack.Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class US_3_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    @Then("driver can click Fleet module on the homepage")
    public void driver_can_click_fleet_module_on_the_homepage() {
        // loginPage.UserNameInput.sendKeys("user10");
        //loginPage.UserNameInput.click();
        //loginPage.UserNameInput.sendKeys("user10");
        //  loginPage.UserNameInput.sendKeys(ConfigurationReader.getProperty("truckDriver1"));
        // loginPage.passwordInputBox.sendKeys("password");
        // loginPage.logInButton.click();
        Driver.getDriver().findElement(By.xpath("//span[@class='title title-level-1']")).click();
    }


    @Then("driver should click Vehicle Odometer page")
    public void driver_should_click_vehicle_odometer_page() {
        Driver.getDriver().findElement(By.xpath("//span[@class='title title-level-2']")).click();
        //String verificationOdometer = Driver.getDriver().findElement(By.xpath("//a[@class='btn main-group btn-primary pull-right ']"));

    }

    @Then("driver should see {string} on the right top and click")
    public void driver_should_see_on_the_right_top_and_click(String string) {

    }
//TC:2

    @When("driver should put value inside Value box")
    public void driver_should_put_value_inside_value_box() {

    }


    @Then("driver should choose date from calendar")
    public void driver_should_choose_date_from_calendar() {

    }
    @Then("driver should put name on name box")
    public void driver_should_put_name_on_name_box() {

    }
    @Then("driver should choose unit from dropdown")
    public void driver_should_choose_unit_from_dropdown() {

    }
    @Then("driver should type and choose from dropdown vehicle module")
    public void driver_should_type_and_choose_from_dropdown_vehicle_module() {

    }
    @Then("driver should click add button on the right")
    public void driver_should_click_add_button_on_the_right() {

    }
    @Then("driver should be able to click any License plate checkbox and click Select")
    public void driver_should_be_able_to_click_any_license_plate_checkbox_and_click_select() {

    }
    @Then("driver should see and click Save button on the right top")
    public void driver_should_see_and_click_save_button_on_the_right_top() {

    }
//TC:3

    @When("driver should see Delete button on top and be able to click")
    public void driver_should_see_delete_button_on_top_and_be_able_to_click() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @Then("driver should see {string} message")
    public void driver_should_see_message(String string) {

    }
    @Then("driver be able to click {string}")
    public void driver_be_able_to_click(String string) {

    }

//TC:4

    @When("driver should see Edit button on top and be able to click")
    public void driver_should_see_edit_button_on_top_and_be_able_to_click() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @Then("driver should to type in Value box")
    public void driver_should_to_type_in_value_box() {

    }
    @Then("driver should see {string} button and click")
    public void driver_should_see_button_and_click(String string) {

    }






}
