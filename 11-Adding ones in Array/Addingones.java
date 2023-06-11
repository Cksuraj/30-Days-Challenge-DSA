
// You start with an array A of size N. Initially all elements of the array A are zero. You will be given K positive integers. Let j be one of these integers, you have to add 1 to all A[i], where i ≥ j. Your task is to print the array A after all these K updates are done.

// Note: 1-based indexing is used everywhere in this question.

// Using prefix sum
 
class Solution {

    public static void update(int a[], int n, int updates[], int k)
    {
     
    //  for(int i=0;i<k;i++){
    //      {
    //      for(int j=updates[i]-1;j<n;j++)
    //          a[j]++;
    //      }         
    // }
    
    // incrementing the array index values by 1 till the k
    for(int i=0; i<k;i++)
    a[updates[i]-1]++;
    
    // adding prefix sum to the array 
    for(int i=1;i<n;i++)
    a[i]+=a[i-1];
      
    }   
}

