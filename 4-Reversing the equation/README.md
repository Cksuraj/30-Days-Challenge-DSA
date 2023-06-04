Question link : https://practice.geeksforgeeks.org/problems/reversing-the-equation2205/1

# Reversing the equation 

## Psudeo code 

## TC O(S)

function reverseEqn(S):

    // Create StringBuilder objects for reversed and currentNumber
    reversed = StringBuilder()
    currentNumber = StringBuilder()

    // Iterate through the characters of S in reverse order
    for i from (S.length - 1) to 0:
        ch = S.charAt(i)   // Get the current character

        if Character.isDigit(ch):
            currentNumber.insert(0, ch)   // Insert the digit at the beginning of currentNumber
        else:
            if currentNumber.length() > 0:
                reversed.append(currentNumber)   // Append the currentNumber to reversed
                currentNumber.setLength(0)   // Reset currentNumber
            
            reversed.append(ch)   // Append the operator to reversed

    if currentNumber.length() > 0:
        reversed.append(currentNumber)   // Append the remaining currentNumber to reversed

    return reversed.toString()   // Return the reversed equation as a string

# Code walkthrough 

Certainly! Here's a short and easy-to-understand walkthrough of the given code:

1. Create two StringBuilder objects, `reversed` and `currentNumber`, to store the reversed equation and the current number being processed.

2. Iterate through the characters of the input string, `S`, starting from the end (right to left).

3. For each character:
   - Check if the character is a digit by using `Character.isDigit(ch)`.
   - If it is a digit, insert it at the beginning of the `currentNumber` StringBuilder using `currentNumber.insert(0, ch)`. This is done to build the current number in reverse order.
   - If it is not a digit (an operator or any other character), it means the current number has ended, and an operator has been encountered.
     - Check if there is a current number in `currentNumber` by verifying `currentNumber.length() > 0`.
     - If there is a current number, append it to the `reversed` StringBuilder using `reversed.append(currentNumber)`.
     - Reset `currentNumber` by setting its length to 0 using `currentNumber.setLength(0)`.
     - Append the operator character to the `reversed` StringBuilder using `reversed.append(ch)`.

4. After the loop ends, check if there is a remaining current number in `currentNumber`.
   - If there is, append it to the `reversed` StringBuilder using `reversed.append(currentNumber)`.

5. Convert the `reversed` StringBuilder to a string using `reversed.toString()`.

6. Return the reversed equation string.
