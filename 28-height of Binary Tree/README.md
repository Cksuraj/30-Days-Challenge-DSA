 Question Link: https://practice.geeksforgeeks.org/problems/maximum-depth-of-binary-tree/1

 - Time Complexcity : O(n)
 - Space Complexcity : O(heightof tree)

 - Approach used in This Question (Recurrtion)
 - we have to calculate depth of tree and return ;
 - In this case The Base Case is if Our Tree is null in this case we we return 0;
 - if there is height exists in BST we will use Recurrcive call to find and then return
 - Now we will take Math.max(from left, right)
 - In Last we will add +1 to the Max to get Max depth(height) of Tree.