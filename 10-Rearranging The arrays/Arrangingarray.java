// Question solution of GFG POTD

class Solution {
    
    public void Rearrange(int a[], int n)
    {
        
        // created Arraylist to stroe the array 
        
             ArrayList<Integer> temp = new ArrayList<>();
        
        // adding -ve values to temp arraylist
        for(int i=0;i<n;i++){
            if(a[i]<0)temp.add(a[i]);
        }
        
        // adding +ve values to temp arraylist
        
        for(int i=0;i<n;i++){
            if(a[i]>=0)temp.add(a[i]);
        }
        
     // Copy elements from temp ArrayList to array a
     
        int i=0;
        for(int x:temp){
            a[i++]=x;
        }
    }
}
