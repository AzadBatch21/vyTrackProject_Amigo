package com.azsdet.vytrack.Pages;

import com.azsdet.vytrack.Utilities.BrowserUtils;
import com.azsdet.vytrack.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class VehicleCostsPage {

    public VehicleCostsPage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[2]/div/div/ul/li[5]/a")
    public WebElement vehicleCostsPage;

    @FindBy(xpath ="//*[@id=\"main-menu\"]/ul/li[2]")
    public WebElement fleet;

    @FindBy(xpath = "//*[@id=\"container\"]/div[2]/div/div/div[2]/a")
    public WebElement createVehicleCost;

    @FindBy(xpath = "//div[@class='btn-group pull-right']")
    public WebElement saveAndClose;




}
