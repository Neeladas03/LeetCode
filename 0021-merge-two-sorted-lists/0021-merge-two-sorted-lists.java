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
        ListNode left=list1,right=list2;
        while(left!=null && right!=null){
            if(left.val<=right.val){
                current.next=left;
                current=current.next;
                left=left.next;
            }
            else{
                current.next=right;
                current=current.next;
                right=right.next;
            }
        }
        if(left!=null)current.next=left;
        if(right!=null)current.next=right;

        return dummy.next;
    }
}