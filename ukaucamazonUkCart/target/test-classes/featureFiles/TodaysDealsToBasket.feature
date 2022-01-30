###########################################################################################################################################################
#
Feature: Amazon UK Application displaying a deal saved for later from Basket
#
###########################################################################################################################################################

  Scenario: Todays deal saved for later from Basket for amazon uk application
    Given user launches AmazonUK successfully
    And navigates to Todays deal tab
    When user selects an item on Todays deal screen
    Then view deals added in basket
    And exit the browser