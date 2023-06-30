class Solution {
    int isDivisible(String s) {
        // code here
        
        // we are declearing the val and x to keep track and update the binary num
        long val=0;
        
        // Declearing the Binarynumbe[] array to iterate over the binary num in one traversal ;
        char binarynumber[]= s.toCharArray();
        
        int x=1;
        
        // iterating in reverse order to update and check the binary num wiht digit 
        
        for(int i=binarynumber.length-1;i>=0;i--){
            if(binarynumber[i]=='1')
            
                //updateing the val
                val=(val+x)%3;
                
                //updateing the x
                x=(x*2)%3;
            
        }
        //   after getting  the Binary-to-decimal, simply return 1 or 0
    
    return val%3==0?1:0;    
        
    }
}