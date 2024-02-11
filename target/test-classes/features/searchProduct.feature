Feature: search and place the order for products

Scenario Outline: search experience for product on landing and offer page
Given User is on landing page 
When User searches with shortName <name> and extract actual name of product
Then User searches for the same shortName <name> in offers page
And validate product name in offers page matches with landing page

Examples:
| name |
|	tom  |
| car	 |
| beet |
