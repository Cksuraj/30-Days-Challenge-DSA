Question Link: https://practice.geeksforgeeks.org/problems/queue-operations/1

### Queue-Operations

Time Complexity: O(N*M)
Space Complexity: O(N)

### code summary 

1. The method takes two parameters: a Queue<Integer> named q and an integer k.
   It creates a new Queue<Integer> named c_q and initializes a variable ans to 0.

2. A while loop is used to iterate until the input queue q is empty.
   Inside the loop, it removes the first element from q using q.poll() and assigns it to the variable curr.

3. The current element curr is added to the auxiliary queue c_q using c_q.add(curr).
   If the current element curr is equal to the integer k, the ans variable is incremented by 1.

4. After the first while loop ends, another while loop is used to transfer the elements from the auxiliary queue 
   c_q back  to the original queue q.

Finally, the method returns the value of ans, which represents the frequency of occurrences of the integer k in the original queue q.


