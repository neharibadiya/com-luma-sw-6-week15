Feature: Women's Page
  As a user I want to check women's page functionality

  @sanity @regression
  Scenario: Verify products are sorted by name
    Given   I am on homepage
    When    I mouse hover on 'Women' tab
    And     I mouse hover on 'Tops' in women tab
    And     I mouse hover and click on 'Jackets' in women tab
    And     I select sort by option as "Product Name"
    Then    I verify products name are sorted in alphabetical order
  @smoke @regression
  Scenario: Verify products are sorted by price
    Given   I am on homepage
    When    I mouse hover on 'Women' tab
    And     I mouse hover on 'Tops' in women tab
    And     I mouse hover and click on 'Jackets' in women tab
    And     I select sort by option as "Price"
    Then    I verify products are sorted by price in low to high order