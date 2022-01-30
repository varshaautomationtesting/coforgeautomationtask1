###########################################################################################################################################################
#
Feature: Amazon UK Application searched product from dropdown selected then added to basket
#
###########################################################################################################################################################

  Scenario: Searched product selected from dropdown added to basket for amazon uk application
    Given AmazonUK application is launched successfully
    When user searches for game
    And selects the first game from search results
    And clicks on add to basket
    Then validate item in basket
    And clicks on Save for later
    And exit the browser