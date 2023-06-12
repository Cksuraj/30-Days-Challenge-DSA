 Question Link : https://practice.geeksforgeeks.org/problems/rod-cutting0840/1

 ### Rod cutting 

for i = 1 to n:
    max_val = Integer.MIN_VALUE

    for j = 0 to i:
        max_val = max(max_val, price[j] + dp[i - j - 1])
        dp[i] = max_val

return dp[n]

### 

As per the above code we are itreting on each lenght of price to calculte the max_val
as per the given  N length of pices of cut 

here [i] is length and [j] is prices of that [i] length  , This is similar probleam like Knapsak probleam