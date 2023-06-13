Standard Question Link : https://practice.geeksforgeeks.org/problems/k-largest-elements4206/1

## Kth Largest element in Array

1. Here , We Have solved it By Two Methods 

2. We can sort using Arrays.sort() Mathod of array and than do one reverse for loop to get 
   kth largest element in Array 


3. Another Mathod we have used is PriorityQueue and Collections.reverseOrder(), Which will give us better timecomplexcity
   O(n+klog n) . 

4. just Read the code i Have commented imp lines 

5. There is one more mathod you can use to solve this probleam using min-heap 


### step by step explnation 

The given code snippet represents a Java method that retrieves the k largest elements from an input array. Here's an explanation of how the code works:

1. It creates a PriorityQueue named pq with the Integer type and reverse ordering using Collections.reverseOrder().

2. It initializes an integer array named ans with a length of k. This array will store the k largest elements.

3. It loops through the input array arr and adds each element to the pq priority queue using the add() method. 

4. It then enters another loop to retrieve the k largest elements from the pq queue. In each iteration, it removes the element with the highest priority (which is the smallest integer due to the reverse ordering) using the remove() method and assigns it to the corresponding position in the ans array.

 --- Finally, it returns the ans array, which now contains the k largest elements in descending order.






