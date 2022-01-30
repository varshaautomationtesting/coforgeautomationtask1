###########################################################################################################################################################
#
Feature: Amazon UK Application displays item one searched added to basket
#
###########################################################################################################################################################

  Scenario: Item one searched added to basket for amazon uk application
    Given AmazonUK application is launched successfully
    When user enters laptop as item in search field
    And clicks on add to basket
    Then validate item in basket
    And clicks on Save for later
    And exit the browser