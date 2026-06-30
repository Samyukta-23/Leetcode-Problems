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
    public ListNode partition(ListNode head, int x) {
        if(head==null || head.next==null) return head;
        ListNode before=new ListNode(0);
        ListNode tail=before;
        ListNode after=new ListNode(0);
        ListNode last=after;
        ListNode temp=head;
        while(temp!=null){
            if(temp.val<x){
                tail.next=temp;
                tail=temp;
                temp=temp.next;
                tail.next=null;
            }
            else{
                last.next=temp;
                last=temp;
                temp=temp.next;
                last.next=null;
            }
           
        }
        if(before.next==null) return after.next;
        ListNode ans=before.next;
        tail.next=after.next;
        return ans;
    }
}