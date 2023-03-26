package pages;
//donde van los metodos que van a ser llamados

import driverConfig.DriverContext;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
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

    public void ingresoAPaginaSolicitada(String search){
        By resultadoBusqueda = By.xpath("(//h3[contains(text(),"+search+")])[1]");
        WebElement resultado = DriverContext.getDriver().findElement(resultadoBusqueda);
        resultado.click();
    }

    public void ir_Anuncios() {
        String textoConectateAhoraAgendaUnaCita = btnAnuncios.getText();

    }

}
