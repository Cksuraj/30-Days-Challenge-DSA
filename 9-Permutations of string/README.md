Question Link : https://practice.geeksforgeeks.org/problems/permutations-of-a-given-string2041/1

## Permutations of a given string

### Dry Run:

here us a Small dry run the code with an example input of str = "abc".

1. The find_permutation method is called with str = "abc".An empty ArrayList called permutations is created.
2. The input string str is converted to a character array and sorted in ascending order, becoming ['a', 'b', 'c'].
3. The sorted character array is converted back to a string, resulting in str = "abc".
4. The permute method is called with the sorted string, an array of boolean values to track used characters, an empty StringBuilder, and the permutations list.

5. Inside the permute method, the base case is checked. Since the length of the current permutation is 0, it does not match the length of the string, so the base case is not met.

6. The method enters a loop that iterates through the characters of the string.

7. The character 'a' is considered first.
The character has not been used, so it is marked as used, added to the current permutation, and the permute method is called recursively.Inside the recursive call, the base case is checked. Since the length of the current permutation is 1, it does not match the length of the string, so the base case is not met.

8. The loop continues with the next character.

The character 'b' is considered.
The character has not been used, so it is marked as used, added to the current permutation (which now contains 'a'), and the permute method is called recursively.
Inside the recursive call, the base case is checked. Since the length of the current permutation is 2,