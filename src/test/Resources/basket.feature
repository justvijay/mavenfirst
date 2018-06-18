Feature: Basket
  As an end user
  I want to add product in to basket
  So that I can get selected product added in to basket.

  Scenario Outline:
    Given I am on the product  page.
    When I click on AddToTrolly button of a <product>.
    Then I should find  the <SelectedProduct> added in basket.
    Examples:
      | product                | SelectedProduct        |
      | Yellow Glider Football | Yellow Glider Football |
#      | backpacks| backpacks       |
#this is not working
