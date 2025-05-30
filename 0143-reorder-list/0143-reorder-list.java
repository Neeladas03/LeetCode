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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null)return;
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode first=head;
        ListNode second=reverse(slow.next);
        slow.next=null;


        while(second!=null){
            ListNode temp1=first.next;
            ListNode temp2=second.next;

            first.next=second;
            second.next=temp1;

            first=temp1;
            second=temp2;
        }
    }

    static ListNode reverse(ListNode head){
        if(head==null)return null;
        ListNode prev1=null,prev2=null;
        while(head!=null){
              prev1=head.next;
              head.next=prev2;
              prev2=head;
              head=prev1;
        }    
        return prev2;
            
            }
}