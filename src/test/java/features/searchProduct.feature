Feature: Search and place the order for products

@OffersPage
Scenario Outline: Search experience for product search in both home and offers page

Given User is on greenCart Landing page
When user search with shortName <Name> and extracted actual name of product
Then user searched for <Name> shortName in offers page
And validate productName in offers page  matches  with landing page

Examples:
| Name |
| Tom  	|
| Beet |

