Question link : https://practice.geeksforgeeks.org/problems/predecessor-and-successor/1

** Here we are writing the same code for ceil and floor funtion which find suc and res. ** 

1-- The ceil function takes a root node of a binary search tree (BST) and an integer x as input and returns the node with the smallest key greater than or equal to x in the BST.

*******

--  Declare a variable res and initialize it to null. This variable will store the result node.

--  Enter a while loop that continues until the root node becomes null.

--  Inside the loop, check if the data value of the current root node is greater than x:

If it is, update the res variable with the current root node because it may be a potential ceil value.
Set the root to its left child to explore the smaller keys in the left subtree.
If the data value of the current root node is not greater than x, it means that the potential ceil value should be greater, so move to the right child of the root to explore larger keys.

----------------------------------------------------------


