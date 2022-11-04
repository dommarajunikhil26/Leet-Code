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
        ListNode curr=head;
        int count=0;
        while(curr!=null){
            count++;
            curr=curr.next;
        }
        curr=head;
        if(count==n){
            head=head.next;
            return head;
        }
        for(int i=0;i<count-n-1;i++){
            curr=curr.next;
        }
        curr.next=curr.next.next;
        return head;
    }
}