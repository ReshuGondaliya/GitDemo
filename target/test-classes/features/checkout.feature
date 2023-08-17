Feature:place the order for products

@PlaceOrder  
Scenario Outline: Search experience for product search in both home and offers page

Given User is on greenCart Landing page
When user search with shortName <Name> and extracted actual name of product
And Added "3" items of the selected product to cart
Then user proceeds to checkout and validate the <NAme> items in checkout page
And verify user has ability to enter promo code and place the order

Examples:
| Name |
| Tom  |


