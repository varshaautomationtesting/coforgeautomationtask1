$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/varsha.pervaram/ukaucamazonUkCart/src/test/resources/featureFiles/EighthGiftAdded.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "###########################################################################################################################################################"
    },
    {
      "line": 2,
      "value": "#"
    }
  ],
  "line": 3,
  "name": "Amazon UK Application displaying eighth gift idea added to Basket",
  "description": "",
  "id": "amazon-uk-application-displaying-eighth-gift-idea-added-to-basket",
  "keyword": "Feature"
});
formatter.before({
  "duration": 12186998700,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 4,
      "value": "#"
    },
    {
      "line": 5,
      "value": "###########################################################################################################################################################"
    }
  ],
  "line": 7,
  "name": "Basket for amazon uk application shows eighth gift idea",
  "description": "",
  "id": "amazon-uk-application-displaying-eighth-gift-idea-added-to-basket;basket-for-amazon-uk-application-shows-eighth-gift-idea",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "AmazonUK application is launched successfully",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "navigates to Gift Ideas tab",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user lands on Gift Ideas screen",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "select the eighth item",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "adds eighth gift idea to basket",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "validate gift idea added in basket",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "exit the browser",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefSearch.amazonukApplicationIsLaunchedSuccessfully()"
});
formatter.result({
  "duration": 854514600,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefGiftIdea.navigatesToGiftIdeasTab()"
});
formatter.result({
  "duration": 2399254300,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefGiftIdea.userLandsOnGiftIdeasScreen()"
});
formatter.result({
  "duration": 1199193300,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefGiftIdea.selectTheEighthItem()"
});
formatter.result({
  "duration": 6183709300,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefGiftIdea.addsEighthGiftIdeaToBasket()"
});
formatter.result({
  "duration": 3317281000,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefGiftIdea.validateGiftIdeaAddedInBasket()"
});
formatter.result({
  "duration": 1596474000,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.exitTheBrowser()"
});
formatter.result({
  "duration": 1590019900,
  "status": "passed"
});
});