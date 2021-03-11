package com.azsdet.vytrack.Step_Definitions;

import com.azsdet.vytrack.Pages.HomePage;
import com.azsdet.vytrack.Pages.LoginPage;
import com.azsdet.vytrack.Utilities.BrowserUtils;
import com.azsdet.vytrack.Utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class US_1_StepDefinitions {
    LoginPage login = new LoginPage();
    HomePage homePage = new HomePage();
    
    @Given("truck driver login as {string} and {string}")
    public void truck_driver_login_as_and(String truckDriverUserName, String password) {
        login.UserNameInput.sendKeys(ConfigurationReader.getProperty(truckDriverUserName));
        login.passwordInputBox.sendKeys(ConfigurationReader.getProperty(password));
        login.logInButton.click();
        BrowserUtils.wait(3);
        
    }
    
    
    @Then("truck driver should be able to see four modules")
    public void truck_driver_should_be_able_to_see_four_modules(List<String> modules) {
        List<String> actualText = BrowserUtils.getElementsText(homePage.hearderLeft);
        Assert.assertTrue(actualText.equals(modules));
    
    
    }
    
    
    @Given("store manager or sales manager login as {string} and {string}")
    public void store_manager_or_sales_manager_login_as_and(String storeManagerUserName, String password) {
        login.UserNameInput.sendKeys(ConfigurationReader.getProperty(storeManagerUserName));
        login.passwordInputBox.sendKeys(ConfigurationReader.getProperty(password));
        login.logInButton.click();
        BrowserUtils.wait(2);
    }
    
    @Then("store manager or sales manager should be able to see eight modules")
    public void store_manager_or_sales_manager_should_be_able_to_see_four_modules(List<String> modules) {
        List<String> actualText = BrowserUtils.getElementsText(homePage.hearderLeft);
        Assert.assertTrue(actualText.equals(modules));
    
    
    }
}
