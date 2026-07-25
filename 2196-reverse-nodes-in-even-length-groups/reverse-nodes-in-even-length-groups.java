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
    public ListNode reverseEvenLengthGroups(ListNode head) {
        ListNode ans=new ListNode(0);
        if(head.next==null) return head;

        int len=0;
        ListNode c=head;
        while(c!=null){
            len++;
            c=c.next;
        }

        ListNode temp=head;
        int cnt=1;
        while(temp!=null){
            List<Integer> list=new ArrayList<>();
            ListNode t2=temp;
            int c2=0;
            while(t2!=null && c2<cnt){
                c2++;
                list.add(t2.val);
                t2=t2.next;
            }
            if(c2%2==0){
                Collections.reverse(list);
                int k=0;
                int c3=0;
                ListNode t3=temp;
                while(t3!=null && c3<c2){
                    t3.val=list.get(k++);
                    t3=t3.next;
                    c3++;
                }
            }
            cnt++;
            temp=t2;
        }
        return head;
    }
}