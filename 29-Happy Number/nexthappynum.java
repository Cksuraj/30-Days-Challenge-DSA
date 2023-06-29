class Solution{

    static int isHappy(int N){
        // code here
        
        // Base Case 
        if(N==1 || N==7)
        return 1;
        
        int sumnum=N; 
        int currnum=N;
        
        // if our sum is Greter than 1 digit next opration i am doing 
        while(sumnum>9){
            // making it zero
            sumnum=0;
            // checking for currnum is it reach to happy num or not 
            while(currnum>0){
                // performing the opration of square and sum of last digit of N  to reach 1  

                int sqnum=currnum%10;
                sumnum+= sqnum*sqnum;
                currnum/=10;
            }
            
            // if suppose we have given N=10000 Now in this case we can eaysliy understand that sum+sqnum ==1
            
            if(sumnum==1)
            return 1;
            currnum=sumnum;
        }
        
        if(sumnum==7)
        return 1;
        return 0;
        
    }
    
    static int nextHappy(int N){
        
        int next=N+1;
        int Reset=next;
        
        // Untile we get our happy num 
        while(true){
            if(isHappy(next)==1)
                return next;
                
                next++;
                
                Reset=next;
            }
        }
    }
    