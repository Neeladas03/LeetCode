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
    public ListNode insertionSortList(ListNode head) {
        if(head==null || head.next==null)return head;
        ListNode slow=head,fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode mid=slow.next;
        slow.next=null;
        ListNode left=insertionSortList(head);
        ListNode right=insertionSortList(mid);

        return merge(left,right);

    }

    static ListNode merge(ListNode left,ListNode right){
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;

        while(left!=null && right!=null){
            if(left.val<=right.val){
                curr.next=left;
                left=left.next;
            }
            else{
                curr.next=right;
                right=right.next;
            }
            curr=curr.next;
        }
        if(left!=null)curr.next=left;
        if(right!=null)curr.next=right;

        return dummy.next;
    }

}