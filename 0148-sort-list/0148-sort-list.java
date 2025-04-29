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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null)return head;

        ListNode mid=getmid(head);
        ListNode righthead=mid.next;
        mid.next=null;

        ListNode left=sortList(head);
        ListNode right=sortList(righthead);
        return merge(left,right);
    }

    static ListNode getmid(ListNode head){
        ListNode fast=head,slow=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    static ListNode merge(ListNode left,ListNode right){
        ListNode dummy=new ListNode(0);
        ListNode current=dummy;

        while(left!=null && right!=null){
            if(left.val<right.val){
                current.next=left;
                left=left.next;
            }
            else{
                current.next=right;
                right=right.next;
            }
            current=current.next;
        }

        if(left!=null)current.next=left;

        if(right!=null)current.next=right;

        return dummy.next;

    }
}