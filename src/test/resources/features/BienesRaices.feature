Feature: Leer descripciones de propiedades

  @TEST_IXR-681 @TESTPLAN_IXR-989
  Scenario: Ver descripcion de Casa frente al bosque
    Given ingreso en la pagina "https://dibrsite1.netlify.app/html/anuncios.html"
    When navego hasta la seccion Anuncios
    And presiono boton ver propiedad Casa frente al bosque
    Then Visualizo descripcion

  @TEST_IXR-682 @TESTPLAN_IXR-989
  Scenario: Ver Consejos para tener una alberca
    Given ingreso en la pagina "https://dibrsite1.netlify.app/html/anuncios.html"
    When navego hasta la seccion Blog
    And  presiono boton Construye una alberca en tu casa
    Then Visualizo descripcion Consejos para tener una alberca