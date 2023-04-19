
// Definition for singly-linked list.
 public class DeleteNode {
    int val;
    DeleteNode next;
    DeleteNode(int x) { val = x; }
  }
 
class DeleteNodeSelected {
    public void deleteNode(DeleteNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }
}