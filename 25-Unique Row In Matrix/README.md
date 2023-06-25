Question Link: https://practice.geeksforgeeks.org/problems/unique-rows-in-boolean-matrix/1

* Time Complexity: O(row * col)
* Auxiliary Space: O(row * col)

1. Here we are using HashSet to find unique Row in Matrx
2. There are 3 type of set in Hash DataStructure 
 - HashSet - It give element in Random order Time complexcity it takes O(n);
 - LinkedHashSet - It has An Order Which we will Insert That will be Return the order we have inserted TC O(n).
 - TreeHashSet  - This use RedBlack Tree Algorithem for the elemetn it takes time complexcity O(n log n).
3. In this case we Are Using LinkedHashSet to store the element in oreder and then return back to the ans .
4.  We have Created ans 2DArraysList to stroe the elemetn.
5. after that, we have created LinkedHashSet and then 2 For loops to iterated over the Row And Col
6. adding into curr Arraylist and then compairing with the set if not  contains then we will add into set.
7. Finally Returing the ans.