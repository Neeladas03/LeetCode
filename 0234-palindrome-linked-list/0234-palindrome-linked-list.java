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
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode second_half=reverse(slow);
        ListNode first=head;

        ListNode temp1=first;
        ListNode temp2=second_half;
        while(temp2!=null){
            if(temp1.val!=temp2.val){
                return false;
            }
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return true;
    }

    static ListNode reverse(ListNode head){
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