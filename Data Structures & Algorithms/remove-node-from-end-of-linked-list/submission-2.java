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
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode right=dummy;
        ListNode left=dummy;

        //maintain n distance between left and right

        for(int i=0;i<n;i++){
            right=right.next;
        }

        while(right.next!=null){// go till last element, not till the actual last which is null
            right=right.next;
            left=left.next;
        }
        left.next=left.next.next;

        return dummy.next;
    }
}
