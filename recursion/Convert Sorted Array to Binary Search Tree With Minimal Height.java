Question: http://www.lintcode.com/en/problem/convert-sorted-array-to-binary-search-tree-with-minimal-height/
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
     * @param A: an integer array
     * @return: a tree node
     */
    public TreeNode sortedArrayToBST(int[] A) {  
        // write your code here
        if (A == null){
            return null;
        }
        return sortedArrayToBST(A,0,A.length - 1);

    }  
    public TreeNode sortedArrayToBST(int[] A, int start, int end){
        if (start > end){
            return null;
        }
        TreeNode root = new TreeNode(A[(start + end)/2]);
        root.left = sortedArrayToBST(A,start, (start + end)/2 - 1);
        root.right = sortedArrayToBST(A, (start + end)/2 + 1, end);
        return root;
    }
}

