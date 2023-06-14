import java.util.*;
class Solution {
    static long maxDiamonds(int[] a, int n, int k) {
        // code here
        
        // 1. Brust force approch 
        // This is giving us TLE
        
        // long ans=0;
        // for(int i=0;i<k;i++){
        //     Arrays.sort(a);
        //     ans+=a[n-1];
        //     a[n-1]=a[n-1]/2;
        // }
        // return ans;
        
        
        // 2. Let's see this Optimized code for this probleam 
        // let's use PriorityQueue to solve
        
        PriorityQueue<Integer> pq =new PriorityQueue<>(Collections.reverseOrder());
        long ans=0;
        
        // adding valuse in Pq
        for(int x:a){
            pq.add(x);
        }
        
        // let's iterate for maximum of diamands 
        // as we need k times so we will only run loop for k-times to get maximum
        for(int i=0;i<k;i++){
            
            //removeing the max-number form array storing in curr
            int curr=pq.remove();
            
            // adding in ans , the element whihch we are removing form array 
            ans+=curr;
            // after adding again adding back to array as per given conditions
            pq.add(curr/2);
        }
        return ans;
    }
}