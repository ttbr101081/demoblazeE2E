Feature: E2E


  @E2E
  Scenario: Compra
    Given Agregar dos productos al carrito "https://www.demoblaze.com"
    When Visualizar el carrito "Total"
    And Completar el Place order
    Then Finalizar la compra  "Thank you for your purchase!"