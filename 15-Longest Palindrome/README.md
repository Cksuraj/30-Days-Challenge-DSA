  Question Link : https://practice.geeksforgeeks.org/problems/longest-palindrome-in-a-string3411/1

  ## Longest Palindrome in a String

### Short Code Summary 

1. The code defines a class named `Solution` with a static method `longestPalin` that takes a string `S` as input and returns the longest palindrome substring in `S`.

2. The method initializes a variable `len` to store the length of the longest palindrome substring found so far and an empty string `ans` to store the longest palindrome substring.

3. It then iterates over the characters of the input string `S` using a for loop. Inside the loop, it first checks for palindromes with odd length by calling the `is_palindrom` method with the current character as the center. If the palindrome found has a length greater than the previously recorded length (`len`), it updates `ans` and `len`.

4. Next, it checks for palindromes with even length by calling the `is_palindrom` method with the current character and the next character as the centers. Again, if the palindrome found has a length greater than `len`, it updates `ans` and `len`.

5. The code also includes a helper method `is_palindrom` that takes a string `S` and two indices `st` and `end` as input. This method checks if the characters at the indices `st` and `end` are the same and expands the indices towards the start and end of the string until the characters are no longer the same. It then returns the substring from `st+1` to `end`, which represents the palindrome found.


-- There Is one more Approach to solve this Question is using DP 

--  I have solved Using Basic approach and By Spaning the String in Odd and Even Length; 