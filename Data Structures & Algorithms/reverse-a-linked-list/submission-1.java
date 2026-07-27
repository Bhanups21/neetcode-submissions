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
        ListNode res=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode temp=new ListNode(curr.val);
            if(res==null){
                res=temp;
            }
            else{
                temp.next=res;
                res=temp;
            }
            curr=curr.next;
        }
        return res;
    }
}
