package uk.auc.amazonUkCart.stepDefinition;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import uk.auc.amazonUkCart.framework.BaseTest;
import uk.auc.amazonUkCart.pages.HomeScreen;

public class MyStepdefSearch {

    private BaseTest baseTest;
    private HomeScreen homeScreen;

    @Given("AmazonUK application is launched successfully")
    public void amazonukApplicationIsLaunchedSuccessfully() {
        homeScreen = new HomeScreen();
        homeScreen.getSearchTextfield().click();
    }

    @When("user enters laptop as item in search field")
    public void userEntersLaptopAsItemInSearchField() {
        baseTest = new BaseTest();
        baseTest.laptopEnteredAsSearchText();
    }

    @And("clicks No thanks on sidesheet")
    public void clicksNoThanksOnSidesheet() {
        baseTest = new BaseTest();
        baseTest.clickNoThanks();
    }

    @And("clicks on Save for later")
    public void clicksOnSaveForLater() {
        baseTest = new BaseTest();
        baseTest.saveForLater();
    }

    @When("user searches for game")
    public void userSearchesForGame() {
        baseTest = new BaseTest();
        baseTest.searchProduct();
    }

    @And("selects the first game from search results")
    public void selectsTheFirstGameFromSearchResults() {
        baseTest = new BaseTest();
        baseTest.firstGameSelected();
    }
}
