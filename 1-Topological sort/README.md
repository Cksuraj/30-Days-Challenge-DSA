
Question link: https://practice.geeksforgeeks.org/problems/topological-sort/1

 Summary, the code performs a topological sorting of a given directed acyclic graph (DAG) using a queue and the concept of indegrees. It starts by calculating the indegree of each vertex and enqueues all the vertices with an indegree of 0. Then, it iteratively dequeues a vertex, adds it to the result array, and updates the indegree of its adjacent vertices. This process continues until all vertices have been processed, and the result array is returned, representing the topological order of the graph's vertices.

1. First, a queue `q` is created using the `LinkedList` class. An array `indegree` is also initialized with the size `V`, which represents the number of vertices in the graph. The `indegree` array is used to store the indegree (number of incoming edges) for each vertex in the graph.

   - `q`: A queue to store vertices with zero indegree.
   - `indegree`: An array to store the indegree of each vertex.

   Additionally, the code calculates the indegree of each vertex by iterating over each vertex `i` from 0 to `V-1` and for each adjacent vertex `x` of `i`, incrementing the `indegree` of `x` by 1.

2. After calculating the indegrees, the code adds all the vertices with an indegree of 0 to the queue `q`. This is done by iterating over each vertex `i` from 0 to `V-1` and if the `indegree` of `i` is 0, it is added to the queue `q`.

   The purpose of this step is to enqueue all the vertices that have no incoming edges, i.e., the vertices that can be the starting point of the topological ordering.

3. The main loop of the algorithm starts. It continues until the queue `q` becomes empty.

   Inside the loop, the code dequeues a vertex `u` from the queue `q` and adds it to the `ans` array at index `ind`. The `ind` variable is incremented to keep track of the current index in the `ans` array.

   Then, for each vertex `v` that is adjacent to `u` (obtained from `adj.get(u)`), the code decrements the `indegree` of `v` by 1. If the `indegree` of `v` becomes 0 after decrementing, it means all the incoming edges to `v` have been processed. In this case, vertex `v` is added to the queue `q`.

   This process continues until all the vertices have been processed, and the queue `q` becomes empty.

4. Finally, the `ans` array, which contains the vertices in topological order, is returned.

