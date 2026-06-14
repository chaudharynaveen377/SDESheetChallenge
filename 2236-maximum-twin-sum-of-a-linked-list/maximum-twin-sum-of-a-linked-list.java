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
    static ArrayList<Integer>lt=new ArrayList<>();
static void LL_to_List(ListNode head){
    while (head!=null){
        lt.add(head.val);
        head=head.next;
    }
}
static int Max_twin(){
    int ans=0;
    for (int i=0;i<lt.size()/2;i++){
        ans=Math.max(ans,(lt.get(i)+lt.get(lt.size()-1-i)));
    }
    return ans;
}
    public int pairSum(ListNode head) {
        lt.clear();
        LL_to_List( head);
        return Max_twin();
    }
}