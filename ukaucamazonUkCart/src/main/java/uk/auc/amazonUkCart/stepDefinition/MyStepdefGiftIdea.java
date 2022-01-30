package uk.auc.amazonUkCart.stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uk.auc.amazonUkCart.framework.BaseTest;
import uk.auc.amazonUkCart.pages.GiftIdeaScreen;
import uk.auc.amazonUkCart.pages.HomeScreen;

public class MyStepdefGiftIdea {

    private BaseTest baseTest;
    private HomeScreen homeScreen;
    private GiftIdeaScreen giftIdeaScreen;

    @And("navigates to Gift Ideas tab")
    public void navigatesToGiftIdeasTab() {
        homeScreen = new HomeScreen();
        homeScreen.getGiftIdeasTab().click();
    }

    @When("user lands on Gift Ideas screen")
    public void userLandsOnGiftIdeasScreen() throws InterruptedException{
        Thread.sleep(1000);
        baseTest = new BaseTest();
        baseTest.giftIdea();
    }

    @And("select the eighth item")
    public void selectTheEighthItem() throws InterruptedException{
        Thread.sleep(1000);
        giftIdeaScreen = new GiftIdeaScreen();
        giftIdeaScreen.getEighthGiftItem().click();
    }

    @And("adds eighth gift idea to basket")
    public void addsEighthGiftIdeaToBasket() throws InterruptedException {
        Thread.sleep(1000);
        baseTest = new BaseTest();
        baseTest.addToBasketSideSheet();
    }

    @Then("validate gift idea added in basket")
    public void validateGiftIdeaAddedInBasket() throws InterruptedException{
        Thread.sleep(1000);
        baseTest = new BaseTest();
        baseTest.eighthGiftIdeaInBasket();
        System.out.println("Gift idea added to basket verified successfully");
    }
}