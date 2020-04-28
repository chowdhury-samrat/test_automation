Feature: Search and place order for Vegetables
@SeleniumTest
Scenario: Search for items and validate results
Given User is on Greencart landing page
When User search for "Cucumber" vegetable
Then "Cucumber" results are displayed

@SeleniumTest
Scenario Outline: Search for items and then move to checkout page
Given User is on Greencart landing page
When User search for <Name> Vegetables
And Added items to cart
And User proceeded to checkout page for purchge
Then Verify selected <Name> items are displayed in Check out page

Examples:
|Name |
|Brinjal |
|Beetroot |