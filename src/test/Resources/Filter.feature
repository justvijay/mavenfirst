


Feature: Filter
  As an end user
  I want to apply filter
  So that I get filtered product.

#  Scenario Outline: Filter by price.

#    Given I am on the home page.
#    When I search for product"adidas"
#    And I select filter "<fvalue>"
#    Then I should get respective product greater than "<minvalue>" and less than "<maxvalue>"
#    Examples:
#      | fvalue    | minvalue | maxvalue |
#      | £20 - £25 | 20.0     | 25.0     |

  Scenario Outline: Filter by Customer ratings.

    Given I am on the home page.
    When I search for product"nike"
    And I select filter "<value>"
    Then I should get respective product with "<expectedvalue>"
    Examples:
      | value    | expectedvalue |
      | 4or more | 4.0           |
      | £5 - £10 | 5 - 10        |
      | Running  | Running       |
#      | 3 or more | 3.0          |
#      | 2 or more | 2.0          |
#      | backpacks | backpacks     |