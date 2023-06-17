//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

// } Driver Code Ends

class Geeks {

    // Function to insert element into the queue
    static void insert(Queue<Integer> q, int k) {

        q.add(k);

    }

    // Function to find frequency of an element

    static int findFrequency(Queue<Integer> q, int k) {

    
        Queue<Integer> c_q = new LinkedList<>();
        int ans = 0;

        // finding the frequency of the element

        while (!q.isEmpty()) {
            int curr = q.poll();
            c_q.add(curr);
            if (curr == k)
                ans++;
        }

        // adding the frequency in ans;
        
        while (!c_q.isEmpty())
            q.add(c_q.poll());
        return ans;
    }

}
