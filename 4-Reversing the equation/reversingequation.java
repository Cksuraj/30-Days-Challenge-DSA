//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine().trim());
        while (t-- > 0) {
            String s;
            s = in.readLine().trim();

            Solution ob = new Solution();

            out.println(ob.reverseEqn(s));
        }
        out.close();
    }
}
// } Driver Code Ends

// User function Template for Java

class Solution {

    String reverseEqn(String S) {
        // createing reversed string and currentNumber

        StringBuilder reversed = new StringBuilder();
        StringBuilder currentNumber = new StringBuilder();

        // as we know for reversing string we have to itreate right to left

        for (int i = S.length() - 1; i >= 0; i--) {

            // stroing each charactr of S string into ch variable
            char ch = S.charAt(i);

            // check if the charecter is num then insert into currentNumberString
            if (Character.isDigit(ch)) {
                currentNumber.insert(0, ch);
            }

            else {

                if (currentNumber.length() > 0) {

                    // here if any number is stroed into the CN than we are appending it into
                    // reverse
                    reversed.append(currentNumber);
                    currentNumber.setLength(0); // after it seting the length 0 for next check
                }
                reversed.append(ch); // after reversing the num and char appending the opratore to reversed string
            }
        }

        // here, we are cheking is any one is reamin to reversed

        if (currentNumber.length() > 0) {
            reversed.append(currentNumber);
        }

        return reversed.toString();
    }

}