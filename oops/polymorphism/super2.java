package oops.polymorphism;
class first{
    void ant(){
        System.out.println("First");
    }
}
class second extends first{
    void ant(){
        super.ant();
        System.out.println("Second");
    }
}
public class super2 {
    public static void main(String[] args) {
        second item=new second();
        item.ant();
    }
}
