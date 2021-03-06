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
    
  //  @FindBy(id = "main-menu")
   // public WebElement header;
    
    

    
    
    
    
    
}





