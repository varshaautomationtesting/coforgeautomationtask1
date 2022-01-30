package uk.auc.amazonUkCart.stepDefinition;

import cucumber.api.java.Before;
import cucumber.api.java.bs.I;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.poi.ss.formula.functions.T;
import uk.auc.amazonUkCart.framework.BaseTest;
import uk.auc.amazonUkCart.pages.BestSellerScreen;
import uk.auc.amazonUkCart.pages.GiftIdeaScreen;
import uk.auc.amazonUkCart.pages.HomeScreen;

public class MyStepdefs {

    private BaseTest baseTest;
    private HomeScreen homeScreen;
    private BestSellerScreen bestSellerScreen;

    @Before
    public void initialise(){
        baseTest = new BaseTest();
        baseTest.initialise();
    }

    @Given("user launches AmazonUK successfully")
    public void userLaunchesAmazonUKSuccessfully() {
        homeScreen = new HomeScreen();
        homeScreen.getBestSellersTab().click();
    }

    @When("user lands on Best Sellers screen")
    public void userLandsOnBestSellersScreen() throws InterruptedException{
        Thread.sleep(1000);
        baseTest = new BaseTest();
        baseTest.bestSellers();
    }

    @And("select the first best seller")
    public void selectTheFirstBestSeller() throws InterruptedException{
        Thread.sleep(1000);
        bestSellerScreen = new BestSellerScreen();
        bestSellerScreen.getFirstBook().click();
    }

    @And("adds first book to basket")
    public void addsFirstBookToBasket() throws InterruptedException{
        Thread.sleep(1000);
        baseTest = new BaseTest();
        baseTest.addToBasket();
        Thread.sleep(1000);
        baseTest.deleteLinkFirstBestSeller();
    }

    @Then("validate item in basket")
    public void validateItemInBasket() throws InterruptedException {
        homeScreen = new HomeScreen();
        homeScreen.getBasketIcon().click();
        Thread.sleep(2000);
    }

    @And("deleted first best seller from basket")
    public void deletedFirstBestSellerFromBasket(){
        baseTest = new BaseTest();
        baseTest.basket();
    }

    @And("exit the browser")
    public void exitTheBrowser() {
        baseTest = new BaseTest();
        baseTest.quitApp();
    }

    @And("select the fourth best seller")
    public void selectTheFourthBestSeller() {
        bestSellerScreen = new BestSellerScreen();
        bestSellerScreen.getFourthBook().click();
    }

    @And("adds to basket")
    public void addsToBasket() throws InterruptedException{
        Thread.sleep(1000);
        baseTest = new BaseTest();
        baseTest.addToBasket();
    }

    @And("product saved for later from basket")
    public void productSavedForLaterFromBasket() throws InterruptedException{
        baseTest = new BaseTest();
        baseTest.saveForLater();
        Thread.sleep(500);
        baseTest.basket();
    }
}
