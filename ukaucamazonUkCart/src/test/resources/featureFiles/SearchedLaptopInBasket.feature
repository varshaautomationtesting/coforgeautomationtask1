###########################################################################################################################################################
#
Feature: Amazon UK Application displays item one searched added to basket
#
###########################################################################################################################################################

  Scenario: Item one searched added to basket for amazon uk application
    Given AmazonUK application is launched successfully
    When user enters laptop as item in search field
    And clicks on add to basket
    And user adds item from sidepane
    Then validate laptop added in basket
    And exit the browser