package steps;

import driverConfig.DriverContext;
import io.cucumber.java.en.Given;

import static constants.Constant.URL_BIENESRAICES;
import static org.junit.Assert.assertEquals;

public class BackgroundBienesRaices {
    @Given("ingreso en la pagina {string}")
    public void ingresoEnLaPagina(String arg0) {
        DriverContext.getDriver().navigate().to(URL_BIENESRAICES);
        String url = DriverContext.getDriver().getCurrentUrl();
        assertEquals(URL_BIENESRAICES, url);
    }
}
