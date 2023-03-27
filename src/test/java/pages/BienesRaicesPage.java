package pages;
//donde van los metodos que van a ser llamados

import driverConfig.DriverContext;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BienesRaicesPage {
    private WebDriver driver;
    private static final Logger log = LoggerFactory.getLogger(BienesRaicesPage.class);
    public BienesRaicesPage(){
        this.driver = DriverContext.getDriver();
        PageFactory.initElements(this.driver, this);
    }
    @FindBy(xpath = "(//a[text()=\"Anuncios\"])")
    WebElement btnAnuncios;

   // @FindBy(xpath = "//h3[contains(text(),\"Casa frente al bosque\")]")
    //WebElement btnCasafrentealbosque;
   @FindBy(xpath = "//a[@class]")
   WebElement btnVerPropiedad;



    public void ir_Anuncios() throws InterruptedException {
         btnAnuncios.click();
        Thread.sleep(3000);

    }

    public void casafrentealbosque() throws InterruptedException {
        Thread.sleep(3000);
        btnVerPropiedad.click();
        Thread.sleep(3000);
    }
    public void validarUrl(){
        String urlActual = DriverContext.getDriver().getCurrentUrl();
        Assertions.assertEquals("https://dibrsite1.netlify.app/html/anuncio.html", urlActual);
    }
}
