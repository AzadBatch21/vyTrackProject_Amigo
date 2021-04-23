package com.azsdet.vytrack.Pages;

import com.azsdet.vytrack.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US_10_Page {
    public US_10_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[@class='title title-level-1'])[1]")
    public WebElement fleet;

    @FindBy(xpath = "(//span[@class='title title-level-2'])[5]")
    public WebElement fuelLogs;

    @FindBy(xpath = "//h1[@class='oro-subtitle']")
    public WebElement headerVFLogs;

    @FindBy(xpath = "//a[@class='btn main-group btn-primary pull-right ']")
    public WebElement creatVehFuelLogs;


    @FindBy(xpath = "//h1[@class='user-name']")
    public WebElement headerVehFuelLogs;

    @FindBy(xpath = "//a[@title='Cancel']")
    public WebElement cancelButton;

    @FindBy(xpath = "(//td[@class='select-row-cell renderable grid-cell grid-body-cell grid-body-cell-massAction'])[8]")
    public WebElement chekBox;
    @FindBy(xpath = "(//td[@data-column-label='Vendor'])[8]")
    public WebElement vendorClick;
    @FindBy(xpath = "//a[@data-message='Are you sure you want to delete this Vehicle Fuel Logs?']")
    public WebElement deleteButton;
    @FindBy(xpath = "//a[@class='btn ok btn-danger']")
    public WebElement yesDeleteButton;
    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement saveAndCloseButton;
    @FindBy(xpath = "//a[@title='Add attachment']")
    public WebElement attachButton;
    @FindBy(xpath = "//input[@type='file']")
    public WebElement fileUpload;
    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement saveButton;
    @FindBy(xpath = "//a[@title='Add an event to this record']")
    public WebElement addEventButton;
    @FindBy(xpath = "//input[@name='oro_calendar_event_form[title]']")
    public WebElement inputText;
    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement saveEventButton;
    @FindBy(xpath = "//i[@class='fa-cog hide-text']")
    public WebElement gridSettingButton;
    @FindBy(xpath = "//input[@type='checkbox']")
    public WebElement selected;
}

