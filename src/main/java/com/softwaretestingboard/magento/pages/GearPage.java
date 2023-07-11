package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class GearPage extends Utility {
    By gearMenu = By.xpath("//span[normalize-space()='Gear']");
    By bags = By.xpath("//a[@id='ui-id-25']");
    By overnightDuffle = By.xpath("//a[normalize-space()='Overnight Duffle']");
    By txtovernightDuffle = By.xpath("//span[@class='base']");
    By changeQuantity = By.xpath("//input[@id='qty']");
    By cartButton = By.xpath("//button[@id='product-addtocart-button']");
    By addedOvernightDuffle = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By shoppingCart = By.xpath("//a[normalize-space()='shopping cart']");
    By quantityTxt = By.xpath("//input[@title='Qty']");
    By priceTxt = By.xpath("//span[@class='cart-price']//span)[2]");
    By quantityChange = By.xpath("//input[@class='input-text qty'])[1]");
    By updateCart = By.xpath("//span[normalize-space()='Update Shopping Cart']");
    By txtPrice = By.xpath("//span[@class='cart-price']//span)[2]");


    public void clickOnGearMenu(){mouseHoverToElement(gearMenu);}
    public void clickOnBags(){mouseHoverToElementAndClick(bags);}
    public void clickOnOvernightDuffle(){clickOnElement(overnightDuffle);}
    public String getVerifyOvernightDuffle(){return getTextFromElement(txtovernightDuffle);}
    public void sendChangeQuantity(){sendTextToElement(changeQuantity,"3");}
    public void clickOnCart(){clickOnElement(cartButton);}
    public String getVerifyOvernightAdded(){return getTextFromElement(addedOvernightDuffle);}
    public void clickOnShoppingCart(){clickOnElement(shoppingCart);}
    public String getVerifyQuantity(){return getTextFromElement(quantityTxt);}
    public String getverifyPrice(){return getTextFromElement(priceTxt);}
    public void sendQuantityChange(){sendTextToElement(quantityChange,"5");}
    public void clickOnUpdateCart(){clickOnElement(updateCart);}
    public String getVerifyTxtPrice(){return getTextFromElement(txtPrice);}

}
