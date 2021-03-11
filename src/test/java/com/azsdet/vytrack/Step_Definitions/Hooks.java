package com.azsdet.vytrack.Step_Definitions;

import com.azsdet.vytrack.Utilities.ConfigurationReader;
import com.azsdet.vytrack.Utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    
    
    @Before
    public void setUpScenario(){
      
        String url = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);
     
     
    }
    
    
    @After
    public void tearDownScenario(Scenario scenario){
        if (scenario.isFailed()) {
            byte[] screenShot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot, "image/png", scenario.getName());
        }
        //Driver.closeDriver();
    }
    
   
    
  
}


