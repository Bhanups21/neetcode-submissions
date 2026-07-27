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
        ListNode head1=null;
        while(head!=null){
            ListNode temp=new ListNode(head.val);
            if(head1==null){
                head1=temp;
            }
            else{
                temp.next=head1;
                head1=temp;
            }
            head=head.next;
        }
        return head1;
    }
}
