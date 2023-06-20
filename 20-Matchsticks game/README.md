 Question Link: https://practice.geeksforgeeks.org/problems/-matchsticks-game4906/1

 ### Matchsticks Game

* Time Complexity: O(1)
* Auxiliary Space: O(1)

* As per The Question given, A and B, are playing the game of matchsticks. In this game, a group of N matchsticks is placed on the table. The players can pick any number of matchsticks from 1 to 4 (both inclusive) during their chance. The player who takes the last match stick wins the game. If A starts first, how many matchsticks should he pick on his 1st turn such that he is guaranteed to win the game or determine if it's impossible for him to win. Return -1 if it's impossible for A to win the game, else return the number of matchsticks should he pick on his 1st turn such that he is guaranteed to win.

### let's understand the  below line code
 
The purpose of the method is to determine the result of a match game based on the input N. Let's break down the code to understand its functionality:

* if(N%5==0) return -1;:

- This condition checks if the value of N is divisible evenly by 5 (i.e., if N is a multiple of 5).
If N is divisible by 5, it means that no matter which number is selected, the remainder will always be 0.
In such a case, the method returns -1, indicating that no valid number can be selected in the match game.


* return (int)(N%5);:

- This line calculates the remainder when N is divided by 5.(N % 5) calculates the remainder.(int) casts the remainder value to an int.The result is then returned.