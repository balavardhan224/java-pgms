package OOPS.inheritance;
// package oops.inheritance;
class A1{
    void ant(){
        System.out.println("Class A");
    }
}
class B1 extends A1{
    void ball(){
        System.out.println("Class B");
    }
}

class C1 extends B1{
    void cat(){
        ant();
        ball();
        System.out.println("Class C");
    }
}

public class multilevelInheritance {
    public static void main(String[] args) {
        C1 item=new C1();
        item.cat();
        item.ball();
        item.ant();
    }
}
