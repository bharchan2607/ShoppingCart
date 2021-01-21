As a shopper, I want to have a shopping cart

Given that I a new shopper
When I begin shopping
Then I expect my cart to be empty





As a shopper, I want to add items to my cart and 
see subtotal of the cart

Given I have an empty cart
When I add an item
Then I expect the subtotal to be the price of 
the item

Given I have a cart with some items
When I add another item
Then I expect the subtotal to reflect the sum of
all the items in my cart




As a shopper, I want to see the quantity of
the same item in my cart



Given I have cart with one item
When I add more of that item
Then I expect to see its quantity update on the cart
As a shopper, I want to see what's in my cart

Given I have an empty cart
When I add items
Then I expect it to see an itemized list of the items along with their price and quantity
As a shopper, I want to see the on sale items highlighted in my cart

Given I have a cart with items that are not on sale
When I add an item that's on sale
Then I expect to see it highlighted
As a shopper, I want to be able to remove items from my cart

Given I have a cart with items
When I remove an item
Then I expect the cart to display the updated itemized list
As a shopper, I want to be able to adjust the quantity of items in my cart

Given I have one item in my cart with a quantity of 3
When I remove one
Then I expect the cart to have 2 of that item.