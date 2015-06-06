/**
 * Definition of TreeNode:
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left, right;
 *     public TreeNode(int val) {
 *         this.val = val;
 *         this.left = this.right = null;
 *     }
 * }
 */
public class Solution {
    /**
     * @param T1, T2: The roots of binary tree.
     * @return: True if T2 is a subtree of T1, or false.
     */
    public boolean equals(TreeNode n1, TreeNode n2) {
        if (n1 == n2){
           return true; 
        } 
        if (n1 == null || n2 == null){
          return false;  
        } 
        if (n1.val != n2.val){// Should use .equals if Node.data isn't primitive
            return false; 
        }
        return equals(n1.left, n2.left) && equals(n1.right, n2.right);
    }

    public boolean isSubtree(TreeNode n1, TreeNode n2) {
        if (n2 == null){
            return true; 
        }
        if (n1 == null){
            return false; 
        }
        return equals(n1, n2) || isSubtree(n1.left, n2) || isSubtree(n1.right, n2);
    }
}

