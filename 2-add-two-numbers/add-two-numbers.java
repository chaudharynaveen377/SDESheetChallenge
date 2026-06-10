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
        int sum=0;
        int carry=0;
        ListNode temp=new ListNode(-1);
        ListNode ans=temp;

        while(l1!=null && l2!=null){
            sum=l1.val+l2.val+carry;
            carry=sum/10;
            sum=sum%10;
            ListNode dum=new ListNode(sum);
            temp.next=dum;
            temp=temp.next;
            l1=l1.next;
            l2=l2.next;
    }



         while(l2!=null){
             sum=l2.val+carry;
            carry=sum/10;
            sum=sum%10;
 ListNode dum=new ListNode(sum);
            temp.next=dum;
            temp=temp.next;
            l2=l2.next;
            
            
         }

          while(l1!=null){
             sum=l1.val+carry;
            carry=sum/10;
            sum=sum%10;
 ListNode dum=new ListNode(sum);
            temp.next=dum;
            temp=temp.next;
            l1=l1.next;
            
            
         }

         if(carry!=0){
             ListNode dum=new ListNode(carry);
            temp.next=dum;
         }

return ans.next;
 }
}