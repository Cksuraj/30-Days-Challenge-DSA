Question link: https://practice.geeksforgeeks.org/problems/adding-ones3628/1

## Adding-ones in Array
## Time complexcity O(k+n);



for (int i = 0; i < k; i++) {
    a[updates[i] - 1]++;
}



Inside the loop, a[updates[i] - 1]++ is executed. 

1.  updates[i] refers to the value at index i in the updates array.

2.  a[updates[i] - 1] accesses the element in the a array at the index specified by updates[i] - 1.

3.  a[updates[i] - 1]++ increments the value of the accessed element by 1.



for (int i = 1; i < n; i++) {
    a[i] += a[i - 1];
}


1.  a[i] refers to the value at index i in the array a.

2.  a[i - 1] refers to the value at the previous index, i - 1, in the array a.

3.  a[i] += a[i - 1] adds the value of a[i - 1] to the value of a[i] and stores the result back in a[i].
