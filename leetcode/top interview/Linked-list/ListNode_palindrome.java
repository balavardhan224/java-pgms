import java.util.*;

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
public class ListNode_palindrome {
    int val;
    ListNode_palindrome next;
    ListNode_palindrome(int x) {
               val = x;
                 next = null;
             }
  }

class Solution {
    public boolean isPalindrome(ListNode_palindrome head) {
    List<Integer> l= new ArrayList<>();
    ListNode_palindrome current=head;
    while (current!=null){
        l.add(current.val);
        current=current.next;
    }
//now check pali
    int f=0;
    int s=l.size()-1;
    while(f<s){
        if(l.get(f)!=l.get(s)){
            return false;
        }
        f++;
        s--;
    }
        
      return true;  
    }
}