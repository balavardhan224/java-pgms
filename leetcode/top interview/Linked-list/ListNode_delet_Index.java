

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
public class ListNode_delet_Index {
    int val;
    ListNode_delet_Index next;
    ListNode_delet_Index(int x) {
               val = x;
                 next = null;
             }
  }
class delete_index_from_end {
    public ListNode_delet_Index removeNthFromEnd(ListNode_delet_Index head, int n) {
        ListNode_delet_Index dummy= new ListNode_delet_Index(0);
        dummy.next=head;
        ListNode_delet_Index initial =dummy, current=dummy;
        for(int i=1;i<=n+1;i++){
            current=current.next;
        }
        while(current!=null){
            current=current.next;
            initial=initial.next;
        }
        initial.next= initial.next.next;
        return dummy.next;
        
    }
}