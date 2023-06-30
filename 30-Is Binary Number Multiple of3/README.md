  Question Link :https://practice.geeksforgeeks.org/problem-of-the-day

# Binary Number Divisible by 3

* Time Complexity: O(|S|)
* Auxiliary Space: O(1)

- This program converts the binary number to decimal form and then checks if it is divisible by 3.

The program uses a simple approach to calculate the decimal value of the binary number using the following steps

- Initialized a variable 'val' to keep track of the decimal value modulo 3.
- Converting the input binary string into a character array.
- Initialized a variable 'x' to keep track of the power of 2 modulo 3.
1. Iterateing over the character array in reverse order.
2. If the current character is '1',then update 'val' by adding 'x' modulo 3 and update 'x' by multiplying it by 2 modulo 3.
3. After iterating through the binary number, now checking 'val' modulo 3 is equal to 0.
4. If 'val' modulo 3 is 0, then it is divisible, so return 1. Otherwise, return 0.

## Approach

By iterating over the binary number in reverse order, the program efficiently updates the decimal value modulo 3 and the power of 2 modulo 3. This approach avoids the need for storing and manipulating the entire decimal value.
