 Question Link : https://practice.geeksforgeeks.org/problems/95bb244da24edd6214086ff934886ccda6ed9da8/1

 ### Min Time 

1. Initializes variables and data structures.
   - Creates an empty `ArrayList` called `temp`.
   - Creates two `HashMap` objects called `mm1` and `mm2`.
   - Finds the maximum value in the `types` array and stores it in `mx`.
   - Creates an integer array `ele` with a size of `mx + 1` and fills it with zeros.

2. Processes the `locations` and `types` arrays.
   - Updates the `mm1` and `mm2` maps based on the types and locations.
   - Updates the `ele` array to indicate the occurrence of types.

3. Builds a list of unique types.
   - Adds types with occurrences to the `temp` list.

4. Initializes a 2D `dp` array.
   - Sets all elements of the `dp` array to -1.

5. Calls the `help` method with arguments.
   - Invokes the `help` method with specific parameters and returns its result.

