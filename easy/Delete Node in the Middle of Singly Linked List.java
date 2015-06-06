Question: http://www.lintcode.com/en/problem/delete-node-in-the-middle-of-singly-linked-list/
//It's easy, but a little tricky here. You may wonder how could I do that without knowing the previous node, but
you can do that by change the current value to the next value and remove the next node. It's the same! Afterall,
you need know the previous node to remove the current node.
/**
 * Definition for ListNode.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int val) {
 *         this.val = val;
 *         this.next = null;
 *     }
 * }
 */ 
public class Solution {
    /**
     * @param node: the node in the list should be deleted
     * @return: nothing
     */
    public void deleteNode(ListNode node) {
        // write your code here
        if (node == null || node.next == null){
            return;
        }
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
