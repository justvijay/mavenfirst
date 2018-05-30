


Feature: Filter
  As a end user
  I want to apply filter
  So that I get filtered product

  Scenario Outline: Filter by customer ratings.

    Given I am on the home page.
    When I search for product"adidas"
    And I select filter "<fvalue>"
    Then I should get respective product filtered by "<expectedvalue>"
    Examples:
      | fvalue   | expectedvalue |
      | 5only    | 5.0           |
      | 4or more | 4.0           |
      | 3or more | 3.0           |
      | 2or more | 2.0           |