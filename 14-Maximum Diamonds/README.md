 Question Link : https://practice.geeksforgeeks.org/problems/chinky-and-diamonds3340/1

 ## Maximum Diamonds

 ### 1st Mathod (Brust forapproach)

1. We will sort array using Arrays.sort().
2. Than, we will run the loop K-times to get Maximum diamonds
3. Now inside the loop we are adding the max into ans and than again adding that element into it by making it half
4. after all we are return the ans;



### 2nd Mathod (Queue DataStructure) 

1. we declared PriorityQueue using Collections.reverseOrder() (To get Max-number at the starting index of arr).
2. Than we will add all the elements in pq.add(arr).
3. after adding in pq, we will remove the top element of pq and add that into our curr variable.
4. we are adding into ans that curr , after that we are making curr element half and than again adding into pq
5. finaly returning the ans 