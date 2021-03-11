package com.azsdet.vytrack.Pages;

import com.azsdet.vytrack.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {
    
    
    public HomePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    
    
    @FindBy(id = "main-menu")
    public List<WebElement> header;
    
    @FindBy(xpath = "//ul[@class='nav-multilevel main-menu']")
    public List<WebElement> header1;
    
    @FindBy(xpath = "//div[@id='main-menu']/ul/li")
    public List<WebElement> hearderLeft;
    
    
    @FindBy(xpath = "//ul/li[2]/div/div/ul/li[1]")
    public WebElement FleetButton;
    
    
    @FindBy(xpath ="(//*[.='Vehicles'])[1]")
    public WebElement vehiclesButton;
    
    
    
    @FindBy(xpath ="//*[@id=\"main-menu\"]/ul/li[2]")
    public WebElement fleet;
    
    
    
    
}





