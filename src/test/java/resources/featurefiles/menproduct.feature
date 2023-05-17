@sanity @regression
Feature: Men's Product page
  As a user I want to check Men's products functionality

  Scenario: User should be able to add product successfully to shopping cart
    Given   I mouse hover on 'Mens' tab
    When    I mouse hover on 'Bottoms' in mens tab
    And     I mouse hover and click on 'Pants' in bottoms tab
    And     I mouse over on product name 'Cronus Yoga Pant'
    And     I mouse hover and click on size of 'Cronus Yoga Pant'
    And     I mouse hover and click on colour of 'Cronus Yoga Pant'
    And     I mouse over on product name 'Cronus Yoga Pant'
    And     I mouse hover and click on 'Add To Cart' button
    Then    I verify the message "You added Cronus Yoga Pant to your shopping cart." for products
    When    I click on 'Shopping Cart' link
    Then    I verify the text "Shopping Cart" on shopping cart page
    And     I verify the product name as "Cronus Yoga Pant" for men's product
    And     I verify the size selected as "32" for pant
    And     I verify the colour selected as "Black" for pant