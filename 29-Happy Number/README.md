Question  Link : https://practice.geeksforgeeks.org/problems/next-happy-number4538/1

* Time Complexity: O(Nlog10N)
* Space Complexity: O(1)

- Base Case if Suppose we got 1 || 7  digit in last N number than sum where we will get our Happy Number after 
  Performing certain Oprations
  - 2nd if our last digit is > 9  we will put is as 0 into the sum 

  - then we are move to currdigit, if it reach us at 1  after performing given Oprations than we will return our Happy Number 
  -  Oprations we are performing 
  - num = curr%10
  - sum+= num*num
  -curr/=10

  - So if while doing this suppose we got any num of digit whihc is allready == 1  so we will return our happy number as 1 

  - and again make our curr = sum 
  - finaly we will call that isHappy Function for to check the Next Happy Num (N+1)