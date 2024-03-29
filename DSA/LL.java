package DSA;

public class LL{

    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size=0;
        head=null;
        tail=null;
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
    //5 null

    public void insertbegg(int val){

        Node node = new Node(val);
        node.value = val;
        node.next=head;
        head=node;
        size+=1;
        if(tail==null){
            tail=node;
        }
    }
    //null
    public void insertend(int val){

        Node node = new Node(val);
        if(tail!=null){
            tail.next=node;
        }
        if(head==null){
            head=node;
        }
        tail=node;
        size+=1;
    }

    public void insert(int val, int index){
        if(index==0){
            insertbegg(val);
            return;
        }
        else if(index==size){
            insertend(val);
            return;
        }
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        Node node=new Node(val,temp.next);
        temp.next=node;
        size++;
    }
    public void deleteFirst(){
        //doubt
        // int val=head.value;
        head=head.next;
        size--;
        if(null==head){
            tail=null;
            
        }
    }
    public Node get(int index){
        Node tempp=head;
        for (int i=0;i<index;i++){
            tempp=tempp.next;
        }
        return tempp;

    }
    public void deleteLast(){
        if (size<=1){
            deleteFirst();
            return;
        }
        else{
            Node SecondLast=get(size-2);
            SecondLast.next=null;
            tail=SecondLast;
            size--;
        }
    }

    public void display(){
        //doubt
        Node current=head;
        while(current!=null){
            System.out.print(current.value+" -> ");
            current=current.next;
        }
        System.out.println("END");
    }
   
   

}
