class Solution
{
    public int klengthpref(String[] arr, int n, int k, String str)
    {
        // count variable to track the number
       int count=0;
       // Base case for the string 
       // why it is so --- if our prefix is greter then our string length than no possibilits to match the prefix
       
       if(k>str.length()) return 0;
       
       // Declaring the prefix and storing substirng into the prefix string
       // using substring mathod 
       // it will store the k substring into the prefix whihc will have the length k that is 3
       String prefix=str.substring(0,k);
       
       // iterating over the string
       
       for(int i=0;i<n;i++){
           
           // seprating the k length substring and storing into the curr
           if(k>arr[i].length()) continue;
           String curr=arr[i].substring(0,k);
           // why not used ==( This will only compare the refrences , memorey)
           // .equals is used to compare exact match
           if(prefix.equals(curr))
           // if found the pair then couter will update ++ ;
           count++;
       }
       
       return count;
    }