Question: http://www.lintcode.com/en/problem/reverse-linked-list-ii/
// dummy node; reverse 
/**
 * Definition for ListNode
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    /**
     * @param ListNode head is the head of the linked list 
     * @oaram m and n
     * @return: The head of the reversed ListNode
     */
    public ListNode reverseBetween(ListNode head, int m , int n) {
        // write your code
        if (head == null || m >= n){
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        head = dummy;
        
        for (int i = 1; i < m; i++) {
            if (head == null) {
                return null;
            }
            head = head.next;
        }
        
        ListNode preNode = head;
        ListNode postNode = head.next;
        ListNode pre = null;
        head = head.next;
        for (int i = m; i < n + 1; i++){
            ListNode tmp = head.next;
            head.next = pre;
            pre = head;
            head = tmp;
        }
        preNode.next = pre;
        postNode.next = head;
        return dummy.next;
        
    }
}
