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
        int size=0;
        ListNode dum=head;
        while(dum!=null){size++;dum=dum.next;}

        int fr=size-n;
        ListNode temp=new ListNode(-1);
        ListNode ans=temp;
        temp.next=head;

        while(fr>0){
            temp=temp.next;
            fr--;
        }
    temp.next=temp.next.next;

    return ans.next;
        
    }
}