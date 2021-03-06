package com.azsdet.vytrack.Pages;

import com.azsdet.vytrack.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    
    
    @FindBy(id = "prependedInput")
    public WebElement UserNameInput;
    
    @FindBy(id = "prependedInput2")
    public WebElement passwordInputBox;
    
    @FindBy(id = "_submit")
    public WebElement logInButton;
    
    
    
}
