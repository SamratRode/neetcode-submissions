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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans=new ListNode(0);
        ListNode curr=ans;
        int carry=0;
        int mod=0;
        while(l1!=null || l2!=null){
            int l1_val=0;
            if(l1!=null){
                l1_val=l1.val;
                l1=l1.next;
            }
            int l2_val=0;
            if(l2!=null){
                l2_val=l2.val;
                l2=l2.next;
            }
            mod=(l1_val+l2_val+carry)%10;
            carry=(l1_val+l2_val+carry)/10;
            curr.next=new ListNode(mod);
            curr = curr.next;

        }
        if(carry!=0){
            curr.next=new ListNode(carry);
        }
        return ans.next;
        
    }
}
