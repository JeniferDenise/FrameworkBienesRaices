Feature: Leer descripciones de propiedades

  Background:
  Given ingreso en la pagina "https://dibrsite1.netlify.app/html/anuncios.html"


  Scenario: Ver descripcion de Casa frente al bosque
    When navego hasta la seccion Anuncios
    And presiono boton ver propiedad Casa frente al bosque
    Then Visualizo descripcion

  Scenario: Ver Consejos para tener una alberca
    When navego hasta la seccion Blog
    And  presiono boton Construye una alberca en tu casa
    Then Visualizo descripcion Consejos para tener una alberca