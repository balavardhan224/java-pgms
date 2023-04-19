
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
public class ListNode_reverse {
    int val;
    ListNode_reverse next;
    ListNode_reverse(int x) {
               val = x;
                 next = null;
             }
            }
class reverse_ll {
    public ListNode_reverse reverseList(ListNode_reverse head) {
        ListNode_reverse prev=null;
        ListNode_reverse current=head;
        while(current!=null){
            ListNode_reverse temp=current.next;
            current.next=prev;
            prev=current;
            current=temp;
        }
        return prev;
    }
}
