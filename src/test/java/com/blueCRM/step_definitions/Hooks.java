package com.blueCRM.step_definitions;

import com.blueCRM.utilities.BrowserUtils;
import com.blueCRM.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import io.cucumber.java.Before;


import java.time.Duration;

import java.time.Duration;

public class Hooks {

@Before
    public void setUp(){
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    
    @After
    public void teardownScenario(Scenario scenario){
        BrowserUtils.sleep(1);
        if (scenario.isFailed()){
            byte [] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
        //Driver.closeDriver();
    }

}
