$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/varsha.pervaram/ukaucamazonUkCart/src/test/resources/featureFiles/SearchedLaptopInBasket.feature");
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
  "name": "Amazon UK Application displays item one searched added to basket",
  "description": "",
  "id": "amazon-uk-application-displays-item-one-searched-added-to-basket",
  "keyword": "Feature"
});
formatter.before({
  "duration": 27269572900,
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
  "name": "Item one searched added to basket for amazon uk application",
  "description": "",
  "id": "amazon-uk-application-displays-item-one-searched-added-to-basket;item-one-searched-added-to-basket-for-amazon-uk-application",
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
  "name": "user enters laptop as item in search field",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "clicks on add to basket",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user adds item from sidepane",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "validate laptop added in basket",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "exit the browser",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefSearch.amazonukApplicationIsLaunchedSuccessfully()"
});
formatter.result({
  "duration": 815358400,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefSearch.userEntersLaptopAsItemInSearchField()"
});
formatter.result({
  "duration": 26022378200,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefSearch.clicksOnAddToBasket()"
});
formatter.result({
  "duration": 740722799,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefSearch.userAddsItemFromSidepane()"
});
formatter.result({
  "duration": 2408029401,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefSearch.validateLaptopAddedInBasket()"
});
formatter.result({
  "duration": 2517362299,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.exitTheBrowser()"
});
formatter.result({
  "duration": 1555180600,
  "status": "passed"
});
});