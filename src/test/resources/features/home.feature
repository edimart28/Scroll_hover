Feature: Home alkosto
  Scenario: Hacer scroll y visualizar opciones del boton mi cuenta.
    Given ingresar a la pagina web
    When hago scroll hasta el final de la pagina
    And hago scroll hasta la parte inicial de la pagina
    Then puedo visualizar las opcionnes del boton Mi cuenta sin hacer clic

