Feature: Basket
  As an end user
  I want to add product in to basket
  So that I can get selected product added in to basket.

  Scenario Outline:
    Given I am on the home page.
    When I search for a product "Adidas"
    And I select a random product
    And I click on addToTrolly button
    Then I should find  the <selectedProduct> in the basket.
    Examples:
      | Product | selectedProduct |
      | Adidas  | Adidas          |
 #     | Nike    | Nike            |
#      | backpacks| backpacks       |

