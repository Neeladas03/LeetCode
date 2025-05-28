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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode groupPrev=dummy;

        while(head!=null){
            ListNode temp=head;
            int count=0;

            while(count<k&& temp!=null){
                temp=temp.next;
                count++;
            }
            if(count<k)break;

            ListNode groupnext=temp;
            ListNode ptr1=null,ptr2=null,curr=head;

            while(curr!=groupnext){
                ptr1=curr.next;
                curr.next=ptr2;
                ptr2=curr;
                curr=ptr1;
            }
            groupPrev.next=ptr2;
            head.next=groupnext;

            groupPrev=head;
            head=groupnext;
        }
        return dummy.next;
    }
}