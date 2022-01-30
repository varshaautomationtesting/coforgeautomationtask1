package uk.auc.amazonUkCart.testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "C:/Users/varsha.pervaram/ukaucamazonUkCart/src/test/resources/featureFiles/EighthGiftAdded.feature"
        ,glue = "uk.auc.amazonUkCart.stepDefinition", monochrome = true
        ,plugin = {"pretty","html:target/Html/Reports"})

public class eighthGiftAdded {
}
