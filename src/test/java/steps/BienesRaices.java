package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BienesRaicesPage;

public class BienesRaices {

    BienesRaicesPage bienesRaicesPage = new BienesRaicesPage();
    @When("navego hasta la seccion Anuncios")
    public void navegoHastaLaSeccionAnuncios() throws InterruptedException {
    bienesRaicesPage.ir_Anuncios();
    }

    @And("presiono boton ver propiedad Casa frente al bosque")
    public void presionoBotonVerPropiedadCasaFrenteAlBosque() throws InterruptedException {
        bienesRaicesPage.casafrentealbosque();
    }

    @Then("Visualizo descripcion")
    public void visualizoDescripcion() {
    bienesRaicesPage.validarUrl();
    }



}
