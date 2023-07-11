package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class MenPage extends Utility {
    By menMenu = By.xpath("//span[normalize-space()='Men']");
    By bottoms = By.xpath("//a[@id='ui-id-18']");
    By pants = By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");
    By cronusYoga = By.xpath("//a[@class='product-item-link']");
    By size32 = By.xpath("//div[@class='swatch-option text'])[1]");
    By blackColour = By.xpath("//div[@id='option-label-color-93-item-49']");
    By addToCart = By.xpath("//a[normalize-space()='Cronus Yoga Pant']");
    By addedCronusMeg = By.xpath("//div[contains(text(),'Cronus ')]");
    By shoppingCartLink = By.xpath("//a[contains(text(),'shopping cart')]");
    By txtShoppingCart = By.xpath("//span[text()='Shopping Cart']");
    By cronusName = By.xpath("//a[text()='Cronus Yoga Pant ']");
    By size32Verify = By.xpath("//dd[contains(text(),'32')]");
    By colouBlackverify = By.xpath("//dd[contains(text(),'Black')]");

//////////////////////////////////////////////////////////////////////////////////
    public void clickOnMenMenu(){mouseHoverToElement(menMenu);}
    public void clickOnBottoms(){mouseHoverToElement(bottoms);}
    public void clickOnPants(){mouseHoverToElementAndClick(pants);}
    public void clickOnCronusYoga(){mouseHoverToElement(cronusYoga);}
    public void clickOnSize32(){mouseHoverToElementAndClick(size32);}
    public void clickOnBlackColour(){mouseHoverToElementAndClick(blackColour);}
    public void clickOnAddToCart(){clickOnElement(addToCart);}
    public String getVerifyCronusMessage(){return getTextFromElement(addedCronusMeg);}
    public void clickOnShoppingCart(){clickOnElement(shoppingCartLink);}
    public String getVerifyShoppingCart(){return getTextFromElement(txtShoppingCart);}
    public String getVerifyCronusName(){return getTextFromElement(cronusName);}
    public String getVerifySize(){return getTextFromElement(size32Verify);}
    public String getVerifyColourBlack(){return getTextFromElement(colouBlackverify);}

}
