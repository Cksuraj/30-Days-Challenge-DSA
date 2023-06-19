Question Link : https://practice.geeksforgeeks.org/problems/rearrange-an-array-with-o1-extra-space3142/1

### Test Case 
* Input:
N = 5

arr[] = {4,0,2,1,3}

Output: 3 4 2 0 1

Explanation: 
arr[arr[0]] = arr[4] = 3.
arr[arr[1]] = arr[0] = 4.
and so on.


Time Complexity: O(N)
Auxiliary Space: O(1)

1. The first Mathod is very simple you can just see and dry run for test case you will understand the logic

2. This one is also simple, insted of adding element into the we are rearrnging the element based on the values of the element.