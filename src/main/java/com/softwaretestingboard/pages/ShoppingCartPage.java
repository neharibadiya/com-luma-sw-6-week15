package com.softwaretestingboard.pages;

import com.softwaretestingboard.browserfactory.ManageBrowser;
import com.softwaretestingboard.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.Element;

import static com.sun.org.apache.xml.internal.security.utils.XMLUtils.getAttributeValue;

public class ShoppingCartPage extends Utility {
    private static final Logger log = LogManager.getLogger(ShoppingCartPage.class.getName());
    public ShoppingCartPage() {
        PageFactory.initElements(ManageBrowser.driver, this);
    }


    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement shoppingCartText;

    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']")
    WebElement productCronusYogaPantName;

    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'32')]")
    WebElement productYogaPantSizeText;

    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'Black')]")
    WebElement productCronusYogaPantColourText;

    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Overnight Duffle']")
    WebElement productOvernightDuffleText;

    @CacheLookup
    @FindBy(xpath = "//input[@title='Qty']")
    WebElement productOverNightDuffleQtyText;

    @CacheLookup
    @FindBy(xpath = "//td[@class='col subtotal']//span[@data-label='Excl. Tax']")
    WebElement productOvernightDufflePriceText;

    @CacheLookup
    @FindBy(xpath = "//input[@class='input-text qty'][1]")
    WebElement qtyFieldInCart;

    @CacheLookup
    @FindBy(xpath = "//div[@class='cart main actions']/descendant::button[2]")
    WebElement updateShoppingCartButton;

    @CacheLookup
    @FindBy(xpath = "//td[@data-th='Subtotal']//span[@class='price']")
    WebElement productPrice;


    public String verifyShoppingCartTitle(){
        log.info("Getting shopping cart title : " + shoppingCartText.toString());
        return getTextFromElement(shoppingCartText);
    }

    public String verifyProductCronusYogaPantName(){
        log.info("Getting product cronus yoga pant name : " + productCronusYogaPantName.toString());
        return getTextFromElement(productCronusYogaPantName);
    }

    public String verifyProductCronusYogaPantSizeText(){
        log.info("Getting product's sixe text : " + productYogaPantSizeText.toString());
        return getTextFromElement(productYogaPantSizeText);
    }

    public String verifyProductCronusYogaPantColourText(){
        log.info("Getting product's colour text : " + productCronusYogaPantColourText.toString());
        return getTextFromElement(productCronusYogaPantColourText);
    }

    public String verifyProductNameOvernightDuffle(){
        log.info("Getting product overnight duffle text : " + productOvernightDuffleText.toString());
        return getTextFromElement(productOvernightDuffleText);
    }

    public String verifyProductOvernightDuffleQtyText(String value){
        log.info("Getting product duffle's quantity text : " + productOverNightDuffleQtyText.toString());
        return getAttributeValue((Element) productOverNightDuffleQtyText, value);
    }

    public String verifyProductOvernightDufflePriceText(){
        log.info("Getting product duffle's price text : " + productOvernightDufflePriceText.toString());
        return getTextFromElement(productOvernightDufflePriceText);
    }

    public void changeFieldInCart(String qty){
        clearTextFromField((By) qtyFieldInCart);
        sendTextToElement(qtyFieldInCart,qty);
        log.info("Changing field in cart : " + qtyFieldInCart.toString());

    }

    public void updateShoppingCart(){
        clickOnElement(updateShoppingCartButton);
        log.info("Updating shopping cart : " + updateShoppingCartButton.toString());

    }

    public String verifyProductPrice(){
        log.info("Getting products price : " + productPrice.toString());
        return getTextFromElement(productPrice);
    }
}
