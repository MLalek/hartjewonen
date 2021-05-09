package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;


public class Hooks {

    @Before
    public void setUp(){
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @After
    public void tearDown(Scenario scenario){
        //attach screenshot of failed scenario before closing driver
        final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()) {
            scenario.attach(screenshot, "image/png", "screenshot");
        }
        Driver.closeDriver();
    }
}
