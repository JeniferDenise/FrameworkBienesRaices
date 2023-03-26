Feature: Leer descripciones de propiedades

  Background:
  Given ingreso en la pagina "https://dibrsite1.netlify.app/html/anuncios.html"


  Scenario: Conocer descripcion de Casa Frente Al Bosque
    When navego hasta la seccion Anuncios
    And presiono boton ver propiedad Casa Frente Al Bosque
    Then Visualizo descripcion

