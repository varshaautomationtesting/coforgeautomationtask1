###########################################################################################################################################################
#
Feature: Amazon UK Application displaying eighth gift idea added to Basket
#
###########################################################################################################################################################

  Scenario: Basket for amazon uk application shows eighth gift idea
    Given AmazonUK application is launched successfully
    And navigates to Gift Ideas tab
    When user lands on Gift Ideas screen
    And select the eighth item
    And adds eighth gift idea to basket
    Then validate gift idea added in basket
    And exit the browser