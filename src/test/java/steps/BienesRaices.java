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


    @When("navego hasta la seccion Blog")
    public void navegoHastaLaSeccionBlog() throws InterruptedException {
        bienesRaicesPage.irABlog();
    }

    @And("presiono boton Construye una alberca en tu casa")
    public void presionoBotonConstruyeUnaAlbercaEnTuCasa() throws InterruptedException {
    bienesRaicesPage.construyeUnaAlberca();
    }

    @Then("Visualizo descripcion Consejos para tener una alberca")
    public void visualizoDescripcionConsejosParaTenerUnaAlberca() {
        bienesRaicesPage.validarUrl2();
    }
}
