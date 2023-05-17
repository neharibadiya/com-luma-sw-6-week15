package com.softwaretestingboard.steps;

import com.softwaretestingboard.pages.HomePage;
import com.softwaretestingboard.pages.ProductPage;
import com.softwaretestingboard.pages.ShoppingCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class GearProductSteps {
    @When("I mouse hover on {string} tab")
    public void iMouseHoverOnGearTab() throws InterruptedException {
        Thread.sleep(500);
        new HomePage().mouseHoverOnGearTab();
    }

    @And("^I mouse hover and click on 'Bags' in gear tab$")
    public void iMouseHoverAndClickOnBagsInGearTab() throws InterruptedException {
        Thread.sleep(500);
        new HomePage().mouseHoverAndClickOnBagsInGear();
    }

    @And("^I click on product name 'Overnight Duffle'$")
    public void iClickOnProductNameOvernightDuffle() {
        new ProductPage().clickOnProductOvernightDuffle();
    }

    @Then("^I verify the text \"([^\"]*)\" for gear product$")
    public void iVerifyTheTextForGearProduct(String expectedText)  {
        String actualText = new ProductPage().verifyOvernightDuffleText();
        Assert.assertEquals(actualText,expectedText);
    }
    @When("I change the quantity as {string} on products page")
    public void iChangeTheQuantityAsOnProductsPage(String qty)  {
        new ProductPage().changeQty(qty);
    }

    @And("^I click on 'Add To Cart' button$")
    public void iClickOnAddToCartButton() {
        new ProductPage().clickOnAddToCartButton();
    }

    @Then("^I verify product name for \"([^\"]*)\"$")
    public void iVerifyProductNameFor(String expectedProductName)  {
        String actualProductName = new ProductPage().verifyOvernightDuffleText();
        Assert.assertEquals(actualProductName,expectedProductName);
    }

    @And("^I verify the quantity as \"([^\"]*)\" as entered$")
    public void iVerifyTheQuantityAsAsEntered(String expectedQty)  {
        String actualQty = new ShoppingCartPage().verifyProductOvernightDuffleQtyText("value");
        Assert.assertEquals(actualQty,expectedQty);
    }

    @And("^I verify the product price as \"([^\"]*)\"$")
    public void iVerifyTheProductPriceAs(String expectedPrice)  {
        String actualPrice = new ShoppingCartPage().verifyProductOvernightDufflePriceText();
        Assert.assertEquals(actualPrice,expectedPrice);
    }
    @When("I change the quantity to {string}")
    public void iChangeTheQuantityTo(String qty)  {
        new ShoppingCartPage().changeFieldInCart(qty);
    }

    @And("^I click on 'Update Shopping Cart' button$")
    public void iClickOnUpdateShoppingCartButton() {
        new ShoppingCartPage().updateShoppingCart();
    }

    @Then("^I verify the product price \"([^\"]*)\"$")
    public void iVerifyTheProductPrice(String expectedTotal) throws InterruptedException {
        Thread.sleep(1000);
        String actualTotal = new ShoppingCartPage().verifyProductPrice();
        Assert.assertEquals(actualTotal,expectedTotal);
    }

    @Then("^I verify product name for \"([^\"]*)\" on shopping cart$")
    public void iVerifyProductNameForOnShoppingCart(String expectedText)  {
        String actualText = new ShoppingCartPage().verifyProductNameOvernightDuffle();
        Assert.assertEquals(actualText,expectedText);
    }



}
