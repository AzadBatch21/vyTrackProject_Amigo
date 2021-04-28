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
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;


public class US_10_StepDefinitions {
    US_10_Page us10Page = new US_10_Page();
    LoginPage loginPage = new LoginPage();

    @Given("Truck driver is already on the login page")
    public void truck_driver_is_already_on_the_login_page() {



       // Driver.getDriver().get("https://app.vytrack.com/user/login");


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

        BrowserUtils.wait(4);
        us10Page.fuelLogs.click();
        BrowserUtils.wait(4);
        String actual = us10Page.headerVFLogs.getText();
        BrowserUtils.wait(4);
        String expected = "Vehicle Fuel Logs";
        Assert.assertEquals(actual, expected);
        System.out.println(actual);



    }

    @Then("Truck driver can create Vehicle Fuel logs")
    public void truck_driver_can_create_vehicle_fuel_logs() throws InterruptedException {

        JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
        executor.executeScript("arguments[0].click();", us10Page.creatVehFuelLogs);
        String expected = us10Page.headerVehFuelLogs.getText();
        String actual = "Create Vehicle Fuel Logs";
        Assert.assertEquals(expected, actual);
        System.out.println(expected);

      //  us10Page.creatVehFuelLogs.click();//

    }

    @Then("Truck driver can cancel Vehicle Fuel logs")
    public void truck_driver_can_can_cle_vehicle_fuel_logs() {

        BrowserUtils.wait(4);
        us10Page.cancelButton.click();


        //String expected = us10Page.headerVehFuelLogs.getText();
        // String actual = "Create Vehicle Fuel Logs";
        // Assert.assertTrue(expected.equals(actual));
        // System.out.println(actual);


    }

    @Then("Truck driver can Edit Vehicle Fuel Logs")
    public void truck_driver_can_edit_vehicle_fuel_logs() {

        us10Page.chekBox.click();
        BrowserUtils.wait(4);
        us10Page.vendorClick.click();

    }

    @Then("Truck driver can delete Vehicle Fuel Logs")
    public void truck_driver_can_delete_vehicle_fuel_logs() {

        BrowserUtils.wait(4);
        us10Page.deleteButton.click();
        BrowserUtils.wait(4);
        us10Page.yesDeleteButton.click();


    }

    @Then("Truck driver can add attachment on Fuel Logs")
    public void truck_driver_can_add_attachment_on_fuel_logs() {

        // Driver.getDriver().navigate().back();
        JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
        executor.executeScript("arguments[0].click();", us10Page.creatVehFuelLogs);
        BrowserUtils.wait(4);
        us10Page.saveAndCloseButton.click();
        String path = "C:\\Users\\Owner\\Desktop\\Capture.PNG";
        us10Page.attachButton.click();

        WebElement chooseFile = us10Page.fileUpload;
        WebElement saveFile = us10Page.saveButton;
        BrowserUtils.wait(4);
        chooseFile.sendKeys(path);
        BrowserUtils.wait(4);
        saveFile.click();



    }

    @Then("Truck driver can add event on Fuel Logs")
    public void truck_driver_can_add_event_on_fuel_logs() {

        BrowserUtils.wait(4);
        us10Page.addEventButton.click();
        BrowserUtils.wait(4);
        us10Page.inputText.sendKeys("6Amigos");
        us10Page.saveEventButton.click();

    }

    @Then("Verify that truck driver can reset the grid by clicking on Grid setting")
    public void verify_that_truck_driver_can_reset_the_grid_by_clicking_on_grid_setting() {

        us10Page.gridSettingButton.click();
        BrowserUtils.wait(4);
        if (us10Page.selected.isSelected()) {
            System.out.println("Driver reset the grid");
        } else {
            System.out.println("TEST FAILED");
        }
    }
}




