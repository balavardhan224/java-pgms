

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
// class delete_index_from_end {
//     public ListNode removeNthFromEnd(ListNode head, int n) {
//         ListNode dummy= new ListNode(0);
//         dummy.next=head;
//         ListNode initial =dummy, current=dummy;
//         for(int i=1;i<=n+1;i++){
//             current=current.next;
//         }
//         while(current!=null){
//             current=current.next;
//             initial=initial.next;
//         }
//         initial.next= initial.next.next;
//         return dummy.next;
        
//     }
// }