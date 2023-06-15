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


//User function Template for Java

class Solution{
    static String longestPalin(String S){
        
    // declaring the nessary variable to solve this probleam
    
      long len=0;
      String ans="";
    
    // Itreting over the string with i
    
      for(int i=0;i<S.length();i++){
    
    // Basicaly we are Spaning here from both side and calulatin the maximum 
    
    // creating curr  to check the possible substring is palindrom or not for ODD and EVEN Case 
    
          String curr =is_palindrom(S,i,i); // ODD  case 
          
          if(curr.length()>len){
              //if coditin execute than we are stroing it in ans and putting the length of the curr string 
              ans=curr;
              len=curr.length();
          }
          
          curr=is_palindrom(S,i,i+1);    // EVEN Case
          if(curr.length()>len){
              ans=curr;
              len=curr.length();
          }
      }
      
      return ans;
        
    }
    
    static String  is_palindrom(String S, int st , int end){
        int n=S.length();

        while(st>=0 && end<n){
            
            if(S.charAt(st)== S.charAt(end)){
                st--;
                end++;
            }
            else break;
        }
        return S.substring(st+1,end);
    }
}