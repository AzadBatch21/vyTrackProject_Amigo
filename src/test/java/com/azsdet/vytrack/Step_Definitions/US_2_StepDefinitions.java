package com.azsdet.vytrack.Step_Definitions;

import com.azsdet.vytrack.Pages.FleetPage;
import com.azsdet.vytrack.Pages.HomePage;
import com.azsdet.vytrack.Utilities.BrowserUtils;
import com.azsdet.vytrack.Utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class US_2_StepDefinitions {
    HomePage homePage = new HomePage();
  //  Faker f=new Faker();
    FleetPage fleetPage=new FleetPage();
    
    
    @When("store manager or sales manager navigates to Vehicle module")
    public void store_manager_or_sales_manager_navigates_to_vehicle_module() {
        BrowserUtils.wait(3);
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(homePage.fleet).moveToElement(homePage.vehiclesButton).click().perform();
        BrowserUtils.wait(3);
    // homePage.vehiclesButton.click();
    
        
    }
    
    
    @Then("store manager or sales manager should be to see all vehicle info on vehicle page")
    public void store_manager_or_sales_manager_should_be_to_see_all_vehicle_info_on_vehicle_page(String expectedText) {
        String actualText=fleetPage.allCars.getText();
        Assert.assertEquals(actualText,expectedText);
        
    }
    
    
    @When("store manager or sales manager clicks on create car")
    public void store_manager_or_sales_manager_clicks_on_create_car() {
       fleetPage.createCar.click();
    }
    
    
    @Then("store manager or sales manager should be able to create and cancel a car")
    public void store_manager_or_sales_manager_should_be_able_to_create_and_cancel_a_car() {
        
        BrowserUtils.wait(1);
        fleetPage.licensePlate.sendKeys("117-VSO");
        fleetPage.driverInput.click();
        fleetPage.driverInput.sendKeys("John Johns");
        
        fleetPage.locationInput.click();
        fleetPage.locationInput.sendKeys("Azerbaijan");
    
        fleetPage.modYearInput.click();
        fleetPage.modYearInput.sendKeys("2021");
    
        fleetPage.colorInput.click();
        fleetPage.colorInput.sendKeys("White");
    
        fleetPage.powerInput.click();
        fleetPage.powerInput.sendKeys("5000");
        
        
        
        fleetPage.saveDropButton.click();
        fleetPage.submitButton.click();
        BrowserUtils.wait(3);
        
    }

}
