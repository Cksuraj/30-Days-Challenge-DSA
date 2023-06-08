//{ Driver Code Starts
    import java.io.*;
    import java.util.*;
    
    // } Driver Code Ends
    class Solution {
        public static String kthPermutation(int N,int K) {
            // code here
            
              List<Integer> numbers = new ArrayList<>();
            for (int i = 1; i <= N; i++) {
                numbers.add(i);
            }
    
            int[] factorial = new int[N + 1];
            factorial[0] = 1;
            for (int i = 1; i <= N; i++) {
                factorial[i] = i * factorial[i - 1];
            }
    
            K--; // Convert K to zero-based index
    
            StringBuilder sb = new StringBuilder();
            for (int i = N; i > 0; i--) {
                int index = K / factorial[i - 1];
                sb.append(numbers.get(index));
                numbers.remove(index);
                K %= factorial[i - 1];
            }
    
            return sb.toString();
        }
    }
            
    
    
    //{ Driver Code Starts.
    
    class IntArray
    {
        public static int[] input(BufferedReader br, int n) throws IOException
        {
            String[] s = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for(int i = 0; i < n; i++)
                a[i] = Integer.parseInt(s[i]);
            
            return a;
        }
        
        public static void print(int[] a)
        {
            for(int e : a)
                System.out.print(e + " ");
            System.out.println();
        }
        
        public static void print(ArrayList<Integer> a)
        {
            for(int e : a)
                System.out.print(e + " ");
            System.out.println();
        }
    }
    
    class GFG {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t;
            t = Integer.parseInt(br.readLine());
            while(t-- > 0){
                
                int[] a = IntArray.input(br, 2);
                
                Solution obj = new Solution();
                String res = obj.kthPermutation(a[0],a[1]);
                
                System.out.println(res);
                
            }
        }
    }
    
    // } Driver Code Ends