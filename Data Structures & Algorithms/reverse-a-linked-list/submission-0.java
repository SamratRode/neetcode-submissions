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
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null){
            //travel to next
            ListNode next=curr.next;
            //reverse the connection
            curr.next=prev;

            //setup prev and curr for next iteration
            prev=curr;
            curr=next;

        }
        return prev;
        
    }
}
