Feature: Place the order for products

Scenario Outline: search experience for product on landing and offer page
Given User is on landing page 
When User searches with shortName <name> and extract actual name of product
And User adds <x> items of the selected product to the cart
Then Validate the <name> items in checkout page 
And Verify user has ability to enter promo code and place the order

Examples:
| name |	x	|
|	tom  |	3	|

