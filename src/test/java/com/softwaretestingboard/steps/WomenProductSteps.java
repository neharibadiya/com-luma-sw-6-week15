package com.softwaretestingboard.steps;

import com.softwaretestingboard.pages.HomePage;
import com.softwaretestingboard.pages.ProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class WomenProductSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {

    }

    public void iMouseHoverOnWomenTab() throws InterruptedException {
        Thread.sleep(1000);
        new HomePage().mouseHoverOnWomenTab();
    }

    @And("^I mouse hover on 'Tops' in women tab$")
    public void iMouseHoverOnTopsInWomenTab() throws InterruptedException {
        Thread.sleep(2000);
        new HomePage().mouseHoverOnTopsInWomenTab();
    }

    @And("^I mouse hover and click on 'Jackets' in women tab$")
    public void iMouseHoverAndClickOnJacketsInWomenTab() throws InterruptedException {
        Thread.sleep(2000);
        new HomePage().mouseHoverAndClickOnJacketsInWomen();
    }

    @And("^I select sort by option as \"([^\"]*)\"$")
    public void iSelectSortByOptionAs(String option)  {
        new ProductPage().selectSortByOption(option);
    }

    @Then("^I verify products name are sorted in alphabetical order$")
    public void iVerifyProductsNameAreSortedInAlphabeticalOrder() {
        new ProductPage().verifyProductsNameAlphabeticalOrder();
    }

    @Then("^I verify products are sorted by price in low to high order$")
    public void iVerifyProductsAreSortedByPriceInLowToHighOrder() {
        new ProductPage().verifyProductsPriceLowToHigh();
    }
}
