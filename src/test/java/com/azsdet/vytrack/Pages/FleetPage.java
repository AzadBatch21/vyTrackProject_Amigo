package com.azsdet.vytrack.Pages;

import com.azsdet.vytrack.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FleetPage {
    
    public FleetPage(){
       PageFactory.initElements(Driver.getDriver(), this);
    }
    
    @FindBy(xpath = "//h1[@class='oro-subtitle']")
    public WebElement allCars;
    
    @FindBy(xpath = "//a[@title='Create Car']")
    public WebElement createCar;
    
    
    
    
    @FindBy(name = "custom_entity_type[LicensePlate]")
    public WebElement licensePlate;
    
    
    @FindBy(id = "custom_entity_type_Tags_1-uid-604856cb504b1")
    public WebElement checkbox;
    
    
    @FindBy(name = "custom_entity_type[Driver]")
    public WebElement driverInput;
    
    @FindBy(name = "custom_entity_type[Location]")
    public WebElement locationInput;
    
    
    @FindBy(id = "custom_entity_type_ChassisNumber-uid-604856cb50c6d")
    public WebElement chasNumInput;
    
    @FindBy(name = "custom_entity_type[ModelYear]")
    public WebElement modYearInput;
    
    @FindBy(name = "custom_entity_type[Power]")
    public WebElement powerInput;
    
    
    @FindBy(id = "custom_entity_type_LastOdometer-uid-604856cb50ded")
    public WebElement lastOdoInput;
    
    @FindBy(id = "date_selector_custom_entity_type_ImmatriculationDate-uid-604856cb50ece")
    public WebElement immaDateInput;
    
    
    @FindBy(id = "date_selector_custom_entity_type_FirstContractDate-uid-604856cb50fae")
    public WebElement firstConDateInput;
    
    @FindBy(id = "custom_entity_type_CatalogValue-uid-604856cb511a7")
    public WebElement catValueInput;
    
    @FindBy(id = "custom_entity_type_SeatsNumber-uid-604856cb51299")
    public WebElement seatsNumInput;
    
    @FindBy(id = "custom_entity_type_DoorsNumber-uid-604856cb5137e")
    public WebElement doorsNumInput;
    
    @FindBy(name = "custom_entity_type[Color]")
    public WebElement colorInput;
    
    @FindBy(id = "custom_entity_type_Color-uid-604856cb5146d")
    public WebElement transInput;
    
    @FindBy(xpath = "//a[@class='btn-success btn dropdown-toggle']")
    public WebElement saveDropButton;
    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement submitButton;
    
    
    
}
