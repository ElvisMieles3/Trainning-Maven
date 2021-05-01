@SearchaProduct
Feature: Search a product

  As QA automation of my  store
  I want to search a product
  to check availability

  @SearchaProductCorrect
  Scenario: Search a product

    When that Elvis search the product "Faded Short Sleeve T-shirts"
    Then Elvis must see product "FADED SHORT SLEEVE T-SHIRTS"
    And  Elvis see the product in stock



