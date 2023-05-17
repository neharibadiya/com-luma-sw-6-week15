package com.softwaretestingboard.steps;

import com.softwaretestingboard.pages.HomePage;
import com.softwaretestingboard.pages.ProductPage;
import com.softwaretestingboard.pages.ShoppingCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class MenProductSteps {
    @Given("^I mouse hover on 'Mens' tab$")
    public void iMouseHoverOnMensTab() throws InterruptedException {
        Thread.sleep(1000);
        new HomePage().mouseHoverOnMensTab();
    }
    @When("I mouse hover on {string} in mens tab")
    public void iMouseHoverOnBottomsInMensTab() throws InterruptedException {
        Thread.sleep(500);
        new HomePage().mouseHoverOnBottomsInMensTab();

    }

    @And("^I mouse hover and click on 'Pants' in bottoms tab$")
    public void iMouseHoverAndClickOnPantsInBottomsTab() throws InterruptedException {
        Thread.sleep(500);
        new HomePage().mouseHoverAndClickOnPantsInBottoms();

    }

    @And("^I mouse over on product name 'Cronus Yoga Pant'$")
    public void iMouseOverOnProductNameCronusYogaPant() {
        new ProductPage().mouseHoverOnProductCronusYogaPant();
    }

    @And("^I mouse hover and click on size of 'Cronus Yoga Pant'$")
    public void iMouseHoverAndClickOnSizeOfCronusYogaPant() {
        new ProductPage().mouseHoverAndClickOnSizeOfCronusYogaPant();

    }

    @And("^I mouse hover and click on colour of 'Cronus Yoga Pant'$")
    public void iMouseHoverAndClickOnColourOfCronusYogaPant() {
        new ProductPage().mouseHoverAndClickOnCronusYogaPantColour();

    }

    @And("^I mouse hover and click on 'Add To Cart' button$")
    public void iMouseHoverAndClickOnAddToCartButton() {
        new ProductPage().mouseHoverAndClickOnAddToCart();

    }

    @Then("^I verify the message \"([^\"]*)\" for products$")
    public void iVerifyTheTextForProductCronusYogaPant(String expectedMessage)  {
        String actualMessage = new ProductPage().verifyProductAddedToCartMessage();
        Assert.assertEquals(actualMessage,expectedMessage);
    }
    @When("I click on {string} link")
    public void iClickOnShoppingCartLink() {
        new ProductPage().clickOnShoppingCartLink();
    }
    @Then("^I verify the text \"([^\"]*)\" on shopping cart page$")
    public void iVerifyTheTextOnShoppingCartPage(String expectedTitle)  {
        String actualTitle =  new ShoppingCartPage().verifyShoppingCartTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
    }
    @And("^I verify the product name as \"([^\"]*)\" for men's product$")
    public void iVerifyTheProductNameAsForMenSProduct(String expectedProductName)  {
        String actualProductName =  new ShoppingCartPage().verifyProductCronusYogaPantName();
        Assert.assertEquals(actualProductName,expectedProductName);
    }
    @And("^I verify the size selected as \"([^\"]*)\" for pant$")
    public void iVerifyTheSizeSelectedAsForPant(String expectedSize)  {
        String actualSize =  new ShoppingCartPage().verifyProductCronusYogaPantSizeText();
        Assert.assertEquals(actualSize,expectedSize);
    }
    @And("^I verify the colour selected as \"([^\"]*)\" for pant$")
    public void iVerifyTheColourSelectedAsForPant(String expectedColour)  {
        String actualColour =  new ShoppingCartPage().verifyProductCronusYogaPantColourText();
        Assert.assertEquals(actualColour,expectedColour);
    }


}
