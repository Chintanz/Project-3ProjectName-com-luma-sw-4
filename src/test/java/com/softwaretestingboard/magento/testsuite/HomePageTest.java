package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.testbase.BaseTet;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTet {
    HomePage homePage = new HomePage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart(){
        homePage.clickOnGearMenu();
//        homePage.clickOnBags();
        homePage.clickOnOvernightDuffle();
        homePage.getVerifyOvernightDuffle();


        homePage.sendChangeQuantity();
        homePage.clickOnCart();
        homePage.getVerifyOvernightAdded();



        homePage.clickOnShoppingCart();
        homePage.getVerifyQuantity();



        homePage.getverifyPrice();



        homePage.sendQuantityChange();
        homePage.clickOnUpdateCart();
        homePage.getVerifyTxtPrice();



    }










}
