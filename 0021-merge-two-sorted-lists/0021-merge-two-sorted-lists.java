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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy=new ListNode(0);
        ListNode current=dummy;

        ListNode ptr1=list1,ptr2=list2;

        while(ptr1!=null && ptr2!=null){
               if(ptr1.val<=ptr2.val){
                current.next=ptr1;
                current=current.next;
                ptr1=ptr1.next;
               }
               else{
                current.next=ptr2;
                current=current.next;
                ptr2=ptr2.next;
               }
        }

       if(ptr1!=null){
        current.next=ptr1;
       }

       if(ptr2!=null){
        current.next=ptr2;
       }

        return dummy.next;
 

    }
}