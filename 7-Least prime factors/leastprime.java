//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int[] ans = ob.leastPrimeFactor(n);
            for(int i = 1; i <=n; i++)
            {
                out.print(ans[i] + " ");
            }
            out.println();
        }
        out.close();
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
 
    public int[] leastPrimeFactor(int N) {
        int[] leastPrimeFactors = new int[N + 1];
        
        // Filling the array with 0 initially

        Arrays.fill(leastPrimeFactors, 0);


        // Since 1 is a special case, setting its least prime factor as 1
        leastPrimeFactors[1] = 1;

        // Iterating through numbers starting from 2 to find the least prime factors
        for (int i = 2; i * i <= N; i++) {
            // If the current number i does not have a least prime factor assigned yet
            if (leastPrimeFactors[i] == 0) {
                // Marking multiples of i as having i as their least prime factor
                for (int j = i * i; j <= N; j += i) {
                    // If the current multiple j does not have a least prime factor assigned yet
                    if (leastPrimeFactors[j] == 0) {
                        leastPrimeFactors[j] = i;
                    }
                }
            }
        }

        // Handling prime numbers
        for (int i = 2; i <= N; i++) {
            // If the number i is prime (i.e., no least prime factor assigned yet)
            if (leastPrimeFactors[i] == 0) {
                leastPrimeFactors[i] = i;
            }
        }
        return leastPrimeFactors;
    }
}
