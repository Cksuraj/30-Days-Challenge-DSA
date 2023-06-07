Question Link : https://practice.geeksforgeeks.org/problems/least-prime-factor5216/1

## Least prime factor

Create an integer array leastPrimeFactors of size N + 1 to store the least prime factors.

Initialize all elements of leastPrimeFactors to 0 using Arrays.fill() method.

Set leastPrimeFactors[1] as 1, since 1 is a special case.

Iterate through numbers from 2 to i * i <= N:

Check if leastPrimeFactors[i] is 0, indicating that it doesn't have a least prime factor assigned yet.
If true, iterate through multiples of i starting from i * i up to N with a step size of i.
Check if leastPrimeFactors[j] is 0, indicating that j doesn't have a least prime factor assigned yet.
If true, assign i as the least prime factor for j by setting leastPrimeFactors[j] = i.
Handle prime numbers:

Iterate through numbers from 2 to N:
Check if leastPrimeFactors[i] is 0, indicating that it doesn't have a least prime factor assigned yet.
If true, assign i as the least prime factor for i itself by setting leastPrimeFactors[i] = i.
