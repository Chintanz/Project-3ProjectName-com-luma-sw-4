package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.MenPage;
import com.softwaretestingboard.magento.testbase.BaseTet;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenTest extends BaseTet {
    HomePage homePage = new HomePage();
    MenPage menPage = new MenPage();
    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException{
    menPage.clickOnMenMenu();
    menPage.clickOnBottoms();
    menPage.clickOnPants();
    menPage.clickOnCronusYoga();
    menPage.clickOnSize32();
    menPage.clickOnBlackColour();
    menPage.clickOnAddToCart();
    menPage.getVerifyCronusMessage();
    String exCronus = "You added Cronus Yoga Pant to your shopping cart";
    String acCronus = menPage.getVerifyCronusMessage();
        Assert.assertEquals(acCronus,exCronus,"You added Cronus Yoga Pant to your shopping cart");
    menPage.clickOnShoppingCart();
    menPage.getVerifyShoppingCart();
        String exShoppingCart = "Shopping Cart";
        String acShoppingCart = menPage.getVerifyShoppingCart();
        Assert.assertEquals(acShoppingCart,exShoppingCart,"Shopping Cart");
    menPage.getVerifyCronusName();
        String exCronusYogaPant = "Cronus Yoga Pant";
        String acCronusYogaPant = menPage.getVerifyCronusName();
        Assert.assertEquals(acCronusYogaPant,exCronusYogaPant,"CronusYogaPant");


    menPage.getVerifySize();
        String exSize32   = "32";
        String acSize32   = menPage.getVerifySize();
        Assert.assertEquals(acSize32,exSize32,"32");


    menPage.getVerifyColourBlack();
        String exColourBlack   = "Black";
        String acClourBlack   = menPage.getVerifyColourBlack();
        Assert.assertEquals(acClourBlack,exColourBlack,"Black");

    }
}
