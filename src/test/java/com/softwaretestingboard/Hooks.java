package com.softwaretestingboard;

import com.cucumber.listener.Reporter;
import com.softwaretestingboard.propertyreader.PropertyReader;
import com.softwaretestingboard.utilities.Utility;
import cucumber.api.Scenario;
import org.junit.After;
import org.junit.Before;

import java.io.IOException;

public class Hooks extends Utility {
    @Before
    public void setUp(){
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));
    }
    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()){
            String screenShotPath = Utility.getScreenshot(driver, scenario.getName().replace(" ","_"));
            try {
                Reporter.addScreenCaptureFromPath(screenShotPath);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        closeBrowser();
    }


}
