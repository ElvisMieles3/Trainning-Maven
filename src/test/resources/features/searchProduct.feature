
Feature: yo como usuario del sistema
  Necesito buscar un producto
  Para tener el conocimiento del valor

  Scenario: Buscar producto con stock
    Given que Elvis esta en el portal
    When el ingresa el nombre del producto a buscar "Faded Short Sleeve T-shirts"
    Then Elvis debe ver el producto "FADED SHORT SLEEVE T-SHIRTS"


