###########################################################################################################################################################
#
Feature: Amazon UK Application displaying empty Basket after adding and deleting the first best seller
#
###########################################################################################################################################################

  Scenario: Basket for amazon uk application emptied by adding deleting first best seller
    Given user launches AmazonUK successfully
    When user lands on Best Sellers screen
    And select the first best seller
    And adds first book to basket
    Then validate item in basket
    And deleted first best seller from basket
    And exit the browser