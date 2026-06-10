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
    
    static ListNode solve(ListNode a, ListNode b, int carry){
        
        if (a == null && b == null){
            if (carry != 0) return new ListNode(carry);
            return null;
        }

        int vala = (a != null ? a.val : 0);
        int valb = (b != null ? b.val : 0);

        int sum = vala + valb + carry;
        int digit = sum % 10;
        int newCarry = sum / 10;

        ListNode node = new ListNode(digit);

        node.next = solve(
            (a != null ? a.next : null),
            (b != null ? b.next : null),
            newCarry
        );

        return node;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return solve(l1, l2, 0);
    }
}
