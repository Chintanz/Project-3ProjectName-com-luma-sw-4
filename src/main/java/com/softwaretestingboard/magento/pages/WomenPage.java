package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class WomenPage extends Utility {
    By womenMenu = By.xpath("//a[@id='ui-id-4']//span[contains(text(),'Women')]");
    By tops = By.xpath("//a[@id='ui-id-9']//span[text()='Tops']");
    By jackets = By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]");
    By productName = By.xpath("//select[@id='sorter'])[1]");
By price = By.xpath("//select[@id='sorter']");


    public void clickOnWomenMenu(){mouseHoverToElement(womenMenu);}
    public void clickOnTops(){mouseHoverToElement(tops);}
    public void clickOnJackets(){mouseHoverToElementAndClick(jackets);}
    public void clickOnProductName(){selectByVisibleTextFromDropDown(productName,"Product Name");}
public void clickOnPriceSortBy(){selectByVisibleTextFromDropDown(price,"Price");}













}
