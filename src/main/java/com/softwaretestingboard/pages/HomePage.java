package com.softwaretestingboard.pages;

import com.softwaretestingboard.browserfactory.ManageBrowser;
import com.softwaretestingboard.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    public HomePage() {
        PageFactory.initElements(ManageBrowser.driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Women')]")
    WebElement womenTab;

    @CacheLookup
    @FindBy(css = "a[id='ui-id-9'] span:nth-child(1)")
    WebElement topsInWomenDropdown ;

    @CacheLookup
    @FindBy(css = "a[id='ui-id-11'] span:nth-child(1)")
    WebElement jacketsInTops;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Men']")
    WebElement mensTab;

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-18']")
    WebElement bottomsInMensDropdown;

    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-23']//span[contains(text(),'Pants')]")
    WebElement pantsInBottoms;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Gear']")
    WebElement gearTab;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Bags']")
    WebElement bagsInGear;


    public void mouseHoverOnWomenTab(){
        mouseHoverToElement(womenTab);
        log.info("Mouse hovering on women's tab : " + womenTab.toString());

    }

    public void mouseHoverOnTopsInWomenTab(){
        mouseHoverToElement(topsInWomenDropdown);
        log.info("Mouse hover on tops in women tab : " + topsInWomenDropdown.toString());


    }

    public void mouseHoverAndClickOnJacketsInWomen(){
        mouseHoverToElementAndClick(jacketsInTops);
        log.info("Mouse hover and clicking on jackets in women : " + jacketsInTops.toString());
    }

    public void mouseHoverOnMensTab(){
        mouseHoverToElement(mensTab);
        log.info("Mouse hovering on mens tab : " + mensTab.toString());
    }

    public void mouseHoverOnBottomsInMensTab(){
        mouseHoverToElement(bottomsInMensDropdown);
        log.info("Mouse hovering on bottoms in mens tab : " + bottomsInMensDropdown.toString());
    }

    public void mouseHoverAndClickOnPantsInBottoms(){
        mouseHoverToElementAndClick(pantsInBottoms);
        log.info("Mouse hover and clicking on pants in bottoms : " + pantsInBottoms.toString());
    }

    public void mouseHoverOnGearTab(){
        mouseHoverToElement(gearTab);
        log.info("Mouse hovering on gear tab : " + gearTab.toString());
    }

    public void mouseHoverAndClickOnBagsInGear(){
        mouseHoverToElementAndClick(bagsInGear);
        log.info("Mouse hovering and clicking on bags in gear tab : " + bagsInGear.toString());
    }
}
