Question link : https://practice.geeksforgeeks.org/problems/find-maximum-equal-sum-of-three-stacks/1

##  Time complexcity will be O(N1+N2+N3)

## Pseudo-code:

{

function maxEqualSum(N1, N2, N3, S1, S2, S3):
    sum1 = 0
    sum2 = 0
    sum3 = 0
    
    for each element x in S1:
        sum1 += x
    for each element x in S2:
        sum2 += x
    for each element x in S3:
        sum3 += x
    
    i = 0
    j = 0
    k = 0
    
    while true:
        if i == N1 or j == N2 or k == N3:
            return 0
        
        if sum1 == sum2 and sum2 == sum3:
            return sum3
        
        if sum1 >= sum2 and sum1 >= sum3:
            sum1 -= S1[i]
            i += 1
        else if sum2 >= sum1 and sum2 >= sum3:
            sum2 -= S2[j]
            j += 1
        else if sum3 >= sum1 and sum3 >= sum2:
            sum3 -= S3[k]
            k += 1

}

### Summay of code excuation:

Now let's walk through the code step-by-step:

Initialize the variables sum1, sum2, and sum3 to zero. These variables will store the sums of the arrays S1, S2, and S3, respectively.

Calculate the sums by iterating over each element in S1, S2, and S3 and adding them to the respective sums (sum1, sum2, sum3).

Initialize the variables i, j, and k to zero. These variables will be used to keep track of the indices of the arrays S1, S2, and S3, respectively.

Enter an infinite loop.

Check if any of the indices (i, j, k) have reached the length of their respective arrays (N1, N2, N3). If so, it means we have traversed all elements in at least one of the arrays. In that case, return 0.

Check if all three sums (sum1, sum2, sum3) are equal. If so, return sum3 since they are all the maximum equal sum.
Determine which sum is the largest among sum1, sum2, and sum3.

If sum1 is the largest, subtract the value of S1[i] from sum1 and increment i.
If sum2 is the largest, subtract the value of S2[j] from sum2 and increment j.
If sum3 is the largest, subtract the value of S3[k] from sum3 and increment k.
Repeat from step 5.