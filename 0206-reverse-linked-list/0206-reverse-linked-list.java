/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode ptr1=null;
        ListNode ptr2=null;
        while(head!=null){
            ptr1=head.next;
            head.next=ptr2;
            ptr2=head;
            head=ptr1;
        }
        head=ptr2;
        return head;
    }
}