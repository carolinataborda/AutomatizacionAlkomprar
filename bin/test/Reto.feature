#Author: ctaborda@bancolombia.com.co
@Feature
Feature: Compra de articulos en la pagina de alkomprar
  yo como usuario 
  quiero ingresar a la pagina de alkomprar
  para agregar productos en el carrito de compras

Background:
Given que un usuario quiere ingresa en la pagina de alkomprar para comprar articulos

  @Escenario1
  Scenario: Registro de un usuario en the ninja store
    When el usuario selecciona un articulo para comprar 
    Then debe ver en el carrito de compras el articulo y cantidad seleccionada

    