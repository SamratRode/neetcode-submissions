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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null){
            return null;
        }
        int len=0;
        ListNode curr=head;
        while(curr!=null){
            curr=curr.next;
            len++;
        }
        int index=len-n;

        if (index == 0) {
            return head.next;
        }    

        int count=1;
        ListNode dummy=head;
        while(count<index){
            dummy=dummy.next;
            count++;
        }
        dummy.next=dummy.next.next;
        return head;
    }
}
