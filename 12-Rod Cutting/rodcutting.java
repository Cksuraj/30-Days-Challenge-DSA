//{ Driver Code Starts
    import java.io.*;
    import java.util.*;
    
    class RodCutting {
    
        public static void main(String args[])throws IOException {
            BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
            PrintWriter out=new PrintWriter(System.out);
            
            int t = Integer.parseInt(in.readLine().trim());
            while (t-- > 0) {
                int n = Integer.parseInt(in.readLine().trim());
                String s[]=in.readLine().trim().split(" ");
                int[] arr = new int[n];
                for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(s[i]);
    
                Solution ob = new Solution();
                out.println(ob.cutRod(arr, n));
            }
            out.close();
        }
    }
    
    // } Driver Code Ends
    
    
    class Solution{
        public int cutRod(int price[], int n) {
           // Best  approach to solve this code is dp and this probleam is similar 0-1 knapsak probleam
            int dp[]=new int[n+1];

            // intilizing the dp[0]
            
            dp[0]=0;
            
            // here i, is itrateing on [n]length of the price array
            for(int i=1;i<=n;i++){
                
                // declaring the max_val with infinity 
                int max_val=Integer.MIN_VALUE;
                
                // here j, is itrateing on [prices] of the prices array 
                for(int j=0;j<i;j++){
                    
                    // here calculating the max_val with the given n cuts length of pieces 
                    max_val=Math.max(max_val , price[j]+dp[i-j-1]);
                    dp[i]=max_val;
                }
            }
            return dp[n];
        }
    }