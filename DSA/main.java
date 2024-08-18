package DSA;

public class main {
    public static void main(String[] args) {
        LL list=new LL();
        list.insertbegg(0);
        list.insertbegg(1);
        list.insertbegg(2);
        list.insertend(9);
        //display
        list.display();
        //insert at position
        list.insert(-1, 0);
        list.insert(2, 0);
        list.insert(3, 0);
        list.display();
        //delere
        list.deleteFirst();
        list.display();
        list.deleteLast();
        list.display();
    }
}