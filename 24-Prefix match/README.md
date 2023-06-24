Question link: https://practice.geeksforgeeks.org/problems/prefix-match-with-other-strings/1

* Time Complexcity: O(n);

* Brust Force Approach

1. Declaring the counter variable to store the count of prefix
2. Declaring the Prefix String to get All the prefix of k length;
3. using the substring mathod to begains with 0 to k and adding that prefix into prefix variable

4. iterating over the string length
5 if k is greter than the arr length we will continue and add that arr[i].length into the curr 

6. comparing tha exact match of prefix with curr using  
 (.equals) 
 7. why not == --> this will only compair the refrences and memory is prifix case we want exact match.
