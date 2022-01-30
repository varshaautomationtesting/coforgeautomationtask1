###########################################################################################################################################################
#
Feature: Amazon UK Application displaying a product saved for later from Basket
#
###########################################################################################################################################################

  Scenario: Product saved for later from Basket for amazon uk application
    Given user launches AmazonUK successfully
    When user lands on Best Sellers screen
    And select the fourth best seller
    And clicks on add to basket
    Then validate item in basket
    And product saved for later from basket
    And exit the browser