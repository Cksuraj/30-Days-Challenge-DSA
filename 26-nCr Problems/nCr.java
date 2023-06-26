import java.util.*;

class Solution{
    static int nCr(int n, int r)
    {
        // Standard Dp Question 
        int dp[]=new int[r+1];
        dp[0]=1;
        
        // Base case after analysing probleam 
        
        if(r>n)
        return 0;
        
        if(r==0 || n==r){
            return 1;
        }
        
        // calculating R
        
        if(r>n-r){
            r=n-r;
        }
        //Createing mod to store the large number
        
        int mod=1000000007;
    
        for(int i=0;i<=n ; i++)
        for(int j=Math.min(i,r);j>0; j--)
        dp[j]= (dp[j]+dp[j-1]) %mod;
        return dp[r];
        
        
        
    }
}