package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.WomenPage;
import com.softwaretestingboard.magento.testbase.BaseTet;
import org.testng.annotations.Test;

public class WomenTest extends BaseTet {
    HomePage homePage = new HomePage();
    WomenPage womenPage = new WomenPage();
    @Test
    public void verifyTheSortByProductNameFilter(){
        womenPage.clickOnWomenMenu();
        womenPage.clickOnTops();
        womenPage.clickOnJackets();
        womenPage.clickOnProductName();
      }
    @Test
    public void verifyTheSortByPriceFilter(){
        womenPage.clickOnWomenMenu();
        womenPage.clickOnTops();
        womenPage.clickOnJackets();
        womenPage.clickOnPriceSortBy();
    }








}
