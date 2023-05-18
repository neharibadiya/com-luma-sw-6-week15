package com.softwaretestingboard.pages;

import com.softwaretestingboard.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductPage extends Utility {
    private static final Logger log = LogManager.getLogger(ProductPage.class.getName());
    public ProductPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(css = ".products .product-item-info .product-item-name")
    List<WebElement> jacketElementList;

    @CacheLookup
    @FindBy(xpath = "//img[starts-with(@class,'product-image-photo')]")
    List<WebElement> noOfProducts;

    @CacheLookup
    @FindBy(xpath = "//select[@id='sorter'][1]")
    WebElement sortByField;

    @CacheLookup
    @FindBy(xpath = "//span[@class='price-wrapper ']//span")
    List<WebElement> jacketsPriceElementList;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Cronus Yoga Pant']")
    WebElement productCronusYogaPant;

    @CacheLookup
    @FindBy(xpath = "//div[@class='swatch-option text'][1]")
    WebElement productCronusYogaPantSize;

    @CacheLookup
    @FindBy(xpath = "//div[@class='swatch-option color'][1]")
    WebElement productCronusYogaPantColour;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Add to Cart')][1]")
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement productAddedToCartMessage;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shoppingCartLink;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Overnight Duffle']")
    WebElement productOvernightDuffle;

    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement productOverNightDuffleText;

    @CacheLookup
    @FindBy(xpath = "//input[@id='qty']")
    WebElement changeField;

    @CacheLookup
    @FindBy(xpath = "//button[@id='product-cartload-button']")
    WebElement addToCartButton;




    public void selectSortByOption(String option) {
        selectByVisibleTextFromDropDown(sortByField, option);
        log.info("Selecting sort by option : " + sortByField.toString());

    }


    public void verifyProductsNameAlphabeticalOrder(){
        List<WebElement> elementList = noOfProducts;
        System.out.println("Total elements are : " + elementList.size());

        List<WebElement> elementListDisplay = jacketElementList;
        List<String> originalProductNameList = new ArrayList<>();
        for (WebElement product : elementListDisplay) {

            originalProductNameList.add(product.getText());
        }
        Collections.sort(originalProductNameList);
        System.out.println(originalProductNameList + "\n");


        List<WebElement> afterSortingElementList=jacketElementList;
        List<String> afterSortingProductName=new ArrayList<>();
        for(WebElement product:afterSortingElementList){
            afterSortingProductName.add(product.getText());
        }
        System.out.println(afterSortingProductName);
        Assert.assertEquals(originalProductNameList,afterSortingProductName,"Not sorted in Alphabetical order");
        log.info("Verifying sorted elements : " + jacketElementList.toString());

    }



    public void mouseHoverOnProductCronusYogaPant(){
        mouseHoverToElement(productCronusYogaPant);
        log.info("Mouse hovering on cronus yoga pant : " + productCronusYogaPant.toString());
    }

    public void mouseHoverAndClickOnSizeOfCronusYogaPant(){
        mouseHoverToElementAndClick(productCronusYogaPantSize);
        log.info("Mouse hovering and click on cronus pant size : " + productCronusYogaPantSize.toString());
    }

    public void mouseHoverAndClickOnCronusYogaPantColour(){
        mouseHoverToElementAndClick(productCronusYogaPantColour);
        log.info("Mouse hovering and clicking on colour of pant : " + productCronusYogaPantColour.toString());
    }
    public void mouseHoverAndClickOnAddToCart(){
        mouseHoverToElementAndClick(addToCart);
        log.info("Mouse hovering and clicking on add to cart : " + addToCart.toString());
    }
    public String verifyProductAddedToCartMessage(){
        log.info("Getting product added to cart message : " + productAddedToCartMessage.toString());
        return getTextFromElement(productAddedToCartMessage);
    }
    public void clickOnShoppingCartLink(){
        clickOnElement(shoppingCartLink);
        log.info("Clicking on shopping cart link : " + shoppingCartLink.toString());
    }
    public void clickOnProductOvernightDuffle(){
        clickOnElement(productOvernightDuffle);
        log.info("Clicking on product overnight duffle : " + productOvernightDuffle.toString());
    }
    public String verifyOvernightDuffleText(){
        log.info("Getting overnight duffle text : " + productOverNightDuffleText.toString());
        return getTextFromElement(productOverNightDuffleText);
    }
    public void verifyProductsPriceLowToHigh(){
        List<WebElement> originalList=jacketsPriceElementList;
        //findElementsFromWebPage(By.cssSelector("span[data-price-type='finalPrice']"))
        List<Double> originalProductPriceList = new ArrayList<>();
        for (WebElement product : originalList) {
            originalProductPriceList.add(Double.valueOf(product.getText().replace("$", "")));
        }
        System.out.println("Before Sorting: " + originalProductPriceList);
        List<WebElement> afterSortingList = jacketsPriceElementList;
        List<Double> afterSortingProductPrice = new ArrayList<>();
        for (WebElement product : afterSortingList) {
            afterSortingProductPrice.add(Double.valueOf(product.getText().replace("$", "")));
        }
        Collections.sort(originalProductPriceList);
        System.out.println("After Sorting: " + afterSortingProductPrice);
        Assert.assertEquals(originalProductPriceList, afterSortingProductPrice,"Error");
        log.info("Verifying elements are sorted : " + jacketsPriceElementList.toString());

    }
    public void changeQty(String qty){
        clearTextFromField(changeField);
        sendTextToElement(changeField, qty);
        log.info("Changing quantity : " + changeField.toString());

    }
    public void clickOnAddToCartButton(){
        clickOnElement(addToCartButton);
        log.info("Clicking on Add to cart button : " + addToCartButton.toString());

    }
}
