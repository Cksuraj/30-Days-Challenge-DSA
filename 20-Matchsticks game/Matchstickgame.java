
import java.util.*;


class MatchstickGame {
    static int matchGame(Long N) {
        
        // If N is divisible by 5, it means that no matter which number is selected, the remainder will always be 0.
        if(N%5==0) return -1;
         
        //  This line calculates the remainder when N is divided by 5.
         return (int)(N%5);
        
    }
};