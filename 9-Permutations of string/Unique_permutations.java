
//{ Driver Code Starts
    import java.util.*;
    import java.lang.*;
    import java.io.*;
    class GFG
    {
        public static void main(String[] args) throws IOException
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter out=new PrintWriter(System.out);
            int t = Integer.parseInt(br.readLine().trim());
            while(t-->0)
            {
                String S = br.readLine().trim();
                Solution obj = new Solution();
                List<String> ans = obj.find_permutation(S);
                for( int i = 0; i < ans.size(); i++)
                {
                    out.print(ans.get(i)+" ");
                }
                out.println();
                            
            }
            out.close();
        }
    }
    
    
    // } Driver Code Ends
    
    
    class Solution {
        public List<String> find_permutation(String str) {
         
         //  creating the list of permutation as ArrayList
         
         List<String> permutations = new ArrayList<>();
         
         // creating the array to store the char
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            str = new String(chars);
    
            permute(str, new boolean[str.length()], new StringBuilder(), permutations);
    
            return permutations;
        }
    
        private void permute(String str, boolean[] used, StringBuilder currentPermutation, List<String> permutations) {
        
        // Base Case of program
        
            if (currentPermutation.length() == str.length()) {
                permutations.add(currentPermutation.toString());
                return;
            }
    
            for (int i = 0; i < str.length(); i++) {
                if (used[i])
                    continue;
    
                if (i > 0 && str.charAt(i) == str.charAt(i - 1) && !used[i - 1])
                    continue;
    
                used[i] = true;
                currentPermutation.append(str.charAt(i));
                permute(str, used, currentPermutation, permutations);
                used[i] = false;
                currentPermutation.setLength(currentPermutation.length() - 1);
            }
        }
    
    }