Question: http://www.lintcode.com/en/problem/add-two-numbers/
//What if the digits are stored in regular order instead of reversed order?

//Answer: We can simple reverse the list, calculate the result, and reverse the result.
/**
 * Definition for singly-linked list.
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
     * @param l1: the first list
     * @param l2: the second list
     * @return: the sum list of l1 and l2 
     */
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null) {
            return null;
        }
            
        ListNode head = new ListNode(0);
        ListNode point = head;
        int carry = 0;
        while(l1 != null && l2!=null){
            int sum = carry + l1.val + l2.val;
            point.next = new ListNode(sum % 10);
            carry = sum / 10;
            l1 = l1.next;
            l2 = l2.next;
            point = point.next;
        }
        
        while(l1 != null) {
            int sum =  carry + l1.val;
            point.next = new ListNode(sum % 10);
            carry = sum /10;
            l1 = l1.next;
            point = point.next;
        }
        
        while(l2 != null) {
            int sum =  carry + l2.val;
            point.next = new ListNode(sum % 10);
            carry = sum /10;
            l2 = l2.next;
            point = point.next;
        }
        
        if (carry != 0) {
            point.next = new ListNode(carry);
        }
        return head.next;
    }
}
/****************************************************/
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int carry =0;
        ListNode res = new ListNode(0);
        ListNode cur1 = l1, cur2 = l2, head=res;
        while(cur1!=null || cur2!=null){
            if(cur1!=null){
                carry+=cur1.val;
                cur1=cur1.next;
            }
            if(cur2!=null){
                carry+=cur2.val;
                cur2=cur2.next;
            }
            head.next=new ListNode(carry%10);
            head=head.next;
            carry/=10;
        }
        if(carry==1) head.next=new ListNode(1);
        return res.next;
    }
