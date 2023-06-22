class Solution {
    static boolean lemonadeChange(int N, int bills[]) {
        // code here
        
        int five=0;
        int ten=0;
        
        // iterating over the N 
        for(int i=0; i<N;i++){
            
            // Checking for the change using nested if else loop 
            
            int x=bills[i];
            if(x==5)
            five++;
            else if(x==10){
                five--; ten++;
            }
            else{
                if(x==20){
                    if(ten>0){
                        ten--; five--;
                    }
                    else{
                        five-=3;
                    }
                }
            }
            if(five<0)
            return false;
        }
        return true;
    }
}
