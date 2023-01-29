import java.util.LinkedList;
import java.util.Scanner;

// class LinkedList
// {
//     Node head;  // head of list

//     /* Node Class */
//     class Node
//     {
//         int data;
//         Node next;
         
//         // Constructor to create a new node
//         Node(int d) {data = d; next = null; }
//     }
// }
class ll{
    public static void main(String[] args) {
        LinkedList ll=new LinkedList<>();
        Scanner n= new Scanner(System.in);
        int l=n.nextInt();
        while(l>0){
            int k =n.nextInt();
            ll.add(k);
            l--;
        }
        System.out.println(ll);
        
    }
}