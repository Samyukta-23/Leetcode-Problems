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
    public int pairSum(ListNode head) {
        int sum=0;
        ListNode temp=head;
        ListNode slow=head,fast=head;
        ListNode prev=slow;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            prev=slow;
            slow=slow.next;
           
        }
        prev.next=reverse(slow);
        prev=prev.next;
        while(prev!=null){
            if((temp.val+prev.val)>sum) sum=temp.val+prev.val;
            prev=prev.next;
            temp=temp.next;
        }
        return sum;
    }

    ListNode reverse(ListNode curr){
        ListNode prev=null;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    
}