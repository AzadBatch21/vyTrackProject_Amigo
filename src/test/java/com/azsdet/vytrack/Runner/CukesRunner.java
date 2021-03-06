package com.azsdet.vytrack.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        
        
        features = "src/test/resources/features",
        glue = "com/azsdet/vytrack/Step_Definitions",
     //   plugin = {"html:target/cucumber-report.html"
    //    },
        dryRun= false,
        tags = ""
        
       

)


public class CukesRunner {
}
