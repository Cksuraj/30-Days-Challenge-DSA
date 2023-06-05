Question link : https://practice.geeksforgeeks.org/problems/find-the-closest-element-in-bst/1

## the Closest Element in BST

### Time complexcity O( heighe of tree ); 

 The code performs an in-order traversal of the BST and updates the `ans` variable with the minimum absolute difference between any node value and the given integer `K`. The final value of `ans` represents the least absolute difference between any node value of the BST and the given integer `K`.

1. Inside the class, there is a static integer variable named `ans` which is initialized with the maximum positive integer value using `Integer.MAX_VALUE`. This variable will store the minimum absolute difference between any node value of the BST and the given integer.

2. Inside the `minDiff` method, the `ans` variable is set to the maximum positive integer value using `Integer.MAX_VALUE`. This is done to ensure that `ans` is initially larger than any potential difference.

3. The `ino` method is called with `root` and `K` as parameters. This method will perform an in-order traversal of the BST to find the closest node value to the given integer `K`.

4. The method returns the value of `ans`, which represents the minimum absolute difference between any node value of the BST and the given integer `K`.

5. Inside the `ino` method, it checks if the `root` is not null to avoid processing empty nodes.

6. If the `root` is not null, it calls the `ino` method recursively passing `root.left` and `k` as parameters to traverse the left subtree of the current node.

7. It updates `ans` by taking the minimum of its current value and the absolute difference between `k` and `root.data`. This ensures that `ans` always stores the minimum difference encountered so far.

8. It calls the `ino` method recursively passing `root.right` and `k` as parameters to traverse the right subtree of the current node.

