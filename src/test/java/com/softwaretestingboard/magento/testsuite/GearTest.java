package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.GearPage;
import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.testbase.BaseTet;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GearTest extends BaseTet {
    HomePage homePage = new HomePage();
    GearPage gearPage = new GearPage();
    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {
        homePage.clickOnGearMenu();
//        homePage.clickOnBags();
//        homePage.clickOnOvernightDuffle();
        gearPage.getVerifyOvernightDuffle();
        String acOvernight = "You added Overnight Duffle to your shopping cart";
        String exOvernight = gearPage.getVerifyOvernightDuffle();
        Assert.assertEquals(acOvernight,exOvernight,"Overnight Duffle");
        Thread.sleep(1000);
        homePage.sendChangeQuantity();
        gearPage.clickOnCart();
        gearPage.getVerifyOvernightAdded();
        String acAdded = "You added Overnight Duffle to your shopping cart";
        String exAdded = gearPage.getVerifyOvernightAdded();
        Assert.assertEquals(acAdded,exAdded,"You added Overnight Duffle");
       Thread.sleep(1000);
        gearPage.clickOnShoppingCart();
        gearPage.getVerifyQuantity();
        String ex3 = "3";
        String ac3 = gearPage.getVerifyQuantity();
        Assert.assertEquals(ac3,ex3,"3");
Thread.sleep(1000);
        gearPage.getverifyPrice();
        String acPrice = "$135.00";
        String exPrice = gearPage.getverifyPrice();
        Assert.assertEquals(acPrice,exPrice,"$135.00");
Thread.sleep(1000);
        gearPage.sendQuantityChange();
        gearPage.clickOnUpdateCart();
        gearPage.getVerifyTxtPrice();
        String acPriceTxt = "$225.00";
        String exPriceTxt = gearPage.getVerifyTxtPrice();
        Assert.assertEquals(exPriceTxt,acPriceTxt,"$225.00");



    }

}
