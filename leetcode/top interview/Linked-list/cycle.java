/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Cycle {
    int val;
    Cycle next;
    Cycle(int x) {
               val = x;
                 next = null;
             }
  }
 
public class Solution_cycle {
    public boolean hasCycle(Cycle head) {
    if(head==null) return false;
    Cycle slow=head;
    Cycle fast=head.next;
    while(slow!=fast){
        if(fast==null || fast.next==null){
            return false;
        }
        slow=slow.next;
        fast=fast.next.next;
        }
        return true;
    }
}