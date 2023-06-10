Question Link : https://practice.geeksforgeeks.org/problems/arranging-the-array1131/1

### Arranging the array


### Summary of the code:

The code rearranges the elements in the input array a by moving all the negative values to the front and all the positive values to the end of the array, while maintaining their relative order. It achieves this by using an ArrayList called temp to temporarily store the elements. First, it iterates over the array and adds the negative values to temp, and then it iterates again to add the positive values. Finally, it copies the elements from temp back to the original array a, resulting in a rearranged array where negative values appear first, followed by positive values.