//{ Driver Code Starts
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int k = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int[] ans = new Solution().kLargest(arr, n, k);
            for (int x : ans) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    int[] kLargest(int[] arr, int n, int k) {
        // code here
        
        //  1. Brust force approach 
        // we will sort the array than do revers for loop to get kth largest element in array
        
        //   Arrays.sort(arr);
        //   int j=0;
        //   int ans[]=new int[k];
        //   for(int i=n-1;i>=n-k;i--){
              
        //       ans[j++]=arr[i];
        //   }
        //   return ans;
        
        // 2. We can use priorityqueue and collections.revers method to ge better time complexcity
        
       // declaring the PriorityQueue and using the collections.reverseOrder method 
       
       PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
      
        int ans[] =new int[k];
      
      // adding in pq
      
        for(int i=0;i<n;i++)
        pq.add(arr[i]);
      
      // storing the Kth largest in pq   
        for(int i=0;i<k;i++)
        ans[i]=pq.remove();
        
        return ans;
        
    }
}