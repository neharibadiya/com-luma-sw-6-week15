Feature: Gear products page
  As a user I want to check Gear products functionality

  @sanity @regression
  Scenario: User should be able to add products successfully to shopping cart
    Given   I am on homepage
    When    I mouse hover on 'Gear' tab
    And     I mouse hover and click on 'Bags' in gear tab
    And     I click on product name 'Overnight Duffle'
    Then    I verify the text "Overnight Duffle" for gear product
    When    I change the quantity as "3" on products page
    And     I click on 'Add To Cart' button
    Then    I verify the message "You added Overnight Duffle to your shopping cart." for products
    When    I click on 'Shopping Cart' link
    Then    I verify product name for "Overnight Duffle" on shopping cart
    And     I verify the quantity as "3" as entered
    And     I verify the product price as "$135.00"
    When    I change the quantity to "5"
    And     I click on 'Update Shopping Cart' button
    Then    I verify the product price "$225.00"