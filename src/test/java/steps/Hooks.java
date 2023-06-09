package steps;


import constants.Navegador;
import driverConfig.DriverContext;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import pages.Reportes2;

import static constants.Constant.URL_GOOGLE;

public class Hooks {
    public WebDriver driver;
    private Scenario scenario;
    private static String takeEvidence;

    static {
        takeEvidence = System.getProperty("evidence", "fullEvidence");
    }

    @Before
    public void setUp(Scenario scenario) throws Throwable {
        this.scenario = scenario;
        DriverContext.setUp(Navegador.Chrome, URL_GOOGLE);
        Reportes2.startReport();
    }


    @After
    public void tearDown(Scenario scenario) {
        DriverContext.quitDriver();

    }

    @AfterStep
    public void capturarEvidencia() throws Exception {

        if (this.scenario.isFailed()) {
            Reportes2.log("Algo ocurrió");

            generateEvidence("[FAIL] Scenario ScreenShots");
        } else if (Hooks.takeEvidence.equalsIgnoreCase("fullEvidence")) {
            generateEvidence("[SUCCESS] Step ScreenShots");

            Reportes2.createTest("Test Something");

        }
        Reportes2.endReport();
    }

    public void generateEvidence(String imageRefName) {
        byte[] screenShot = ((TakesScreenshot) DriverContext.getDriver()).getScreenshotAs(OutputType.BYTES);
        this.scenario.attach(screenShot, "image/png", imageRefName);
    }
}