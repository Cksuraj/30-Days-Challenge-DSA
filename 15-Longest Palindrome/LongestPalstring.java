//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestPalin(S));
        }
    }
}

// } Driver Code Ends


// This is First Mathod Basic Approach 

class Solution{
    static String longestPalin(String S){
        
      long len=0;
      String ans="";
      for(int i=0;i<S.length();i++){
          StringBuilder curr =new StringBuilder();
          
          for(int j=i;j<S.length();j++){
              
              curr.append(S.charAt(j));
              if(help(curr.toString())){
                  
                  if(curr.length()>len){
                      ans=curr.toString();
                      len=curr.length();
                  }
              }
          }
          
      }
      return ans;
        
    }
    
    static boolean  help(String S){
        int n=S.length();
        int st=0;
        int end=n-1;
        while(st<end){
            if(S.charAt(st)== S.charAt(end)){
                st++;
                end--;
            }
            else return false;
        }
        return true;
    }
}