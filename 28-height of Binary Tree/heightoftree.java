import java.util.*;
// A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}

class Solution {
  public static int maxDepth(Node root) {
    // code here
    
    // Base Case 
    
    if(root==null){
        return 0;
    }
    // max variable to stroe the level-height of tree
    int max=0;
    int l=maxDepth(root.left);
    int r=maxDepth(root.right);
    
    // here we have to just calculate heigth of tree
    
     max=Math.max(l,r);
     
     // after taking max height just addin one 1;
     return max+1;

  }
}
     
