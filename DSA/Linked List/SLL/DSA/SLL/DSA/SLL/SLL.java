
public class SLL {
    private Node head;
    private Node tail;
    private int size;
    public SLL(){
        head=null;
        tail=null;
        this.size=size;
    }

   
    private class Node{
        private int value;
        private Node next;
 
        public Node(int value){
            this.value=value;
        }

        public Node(int value, Node next){
            this.value=value;
            this.next=next;
        } 
    }
    //insert begg
    public void insert_begg(int value){
        Node node=new Node(value);
        node.value=value;
        node.next=head;
        head=node;
        size++;
        if(tail==null){
            tail=null;
        }
    }
    //print
    public void print(){
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            System.out.println(temp.value+"->");
        }
    }
   
}
