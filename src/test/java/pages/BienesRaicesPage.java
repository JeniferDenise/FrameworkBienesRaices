package pages;
//donde van los metodos que van a ser llamados

import driverConfig.DriverContext;
import org.junit.jupiter.api.Assertions;
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
   @FindBy(xpath = "//a[@class]")
   WebElement btnVerPropiedad;

    @FindBy(xpath = "//a[contains (text (),\"Blog\")]")
    WebElement btnVerBlog;

    @FindBy(xpath = "//h4[contains(text(),'Construye una alberca en tu casa')]")
    WebElement btnConstruyeUnaAlberca;



    //Metodos para scenario:  Ver descripcion de Casa frente al bosque
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
    //Metodos para scenario: Ver Consejos para tener una alberca
    public void irABlog() throws InterruptedException {
        btnVerBlog.click();
        Thread.sleep(3000);
    }
    public void construyeUnaAlberca() throws InterruptedException {
        Thread.sleep(3000);
        btnConstruyeUnaAlberca.click();
        Thread.sleep(3000);
    }
    public void validarUrl2(){
        String urlActual = DriverContext.getDriver().getCurrentUrl();
        Assertions.assertEquals("https://dibrsite1.netlify.app/html/entrada.html", urlActual);
    }
}
