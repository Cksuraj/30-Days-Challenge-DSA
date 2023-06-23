Question link: https://practice.geeksforgeeks.org/problems/task-scheduler/1

* Time Complexity: O(N)
* Auxiliary Space: O(1)

-  the code determines the minimum number of intervals required to complete a set of tasks, taking into account a cooling period between tasks of the same type. It uses an array to count the occurrences of each task, identifies the task with the maximum count and the number of tasks with that count, and calculates the necessary intervals and idle time to complete the tasks efficiently.

* Code walkthrough 

1. Create an array counter of size 26 to store the count of each task. The array is initialized with zeros.

2. Initialize variables max and maxCount to keep track of the task with the maximum count and the number of tasks    with that count, respectively.

3. Increment the count of the corresponding task in the counter array.

4. If the count of the current task is equal to the current maximum count (max), increment maxCount.

5. If the count of the current task is greater than the current maximum count (max), update max and set maxCount to 1.

6. Calculate the number of parts needed to accommodate the tasks. Subtract 1 from the maximum count to exclude the last part.

7. Calculate the length of each part. Subtract (maxCount - 1) from the cooling period K.

8. Calculate the number of empty slots available in the parts. Multiply the number of parts (partCount) by the part length (partLength).

9. Calculate the number of tasks that are not part of the maximum count. Subtract max * maxCount from the total number of tasks tasks.length.

10. Calculate the number of idle intervals needed. Take the maximum of 0 and the difference between the empty slots and the available tasks.

Return the sum of the total number of tasks and the number of idle intervals.
