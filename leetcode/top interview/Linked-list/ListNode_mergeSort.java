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
public class ListNode_mergeSort {
    int val;
    ListNode_mergeSort next;
    ListNode_mergeSort(int x) {
               val = x;
                 next = null;
             }
  }
class Solution {
    public ListNode_mergeSort mergeTwoLists(ListNode_mergeSort list1, ListNode_mergeSort list2) {
        ListNode_mergeSort nextNode=new ListNode_mergeSort(0);
        ListNode_mergeSort temp = nextNode;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                temp.next=list1;
                list1=list1.next;
            }
            else{
                temp.next=list2;
                list2=list2.next;
            }
            temp=temp.next;
        }
        if(list1!=null){
            temp.next=list1;
        }
        else{
            temp.next=list2;
        }
        return nextNode.next;
    }
}