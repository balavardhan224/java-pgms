package oops.inheritance;
class A{
    void ant(){
        System.out.println("Class A");
    }
}
class B extends A{
    void ball(){
        System.out.println("Class B");
    }
}

class C extends B{
    void cat(){
        System.out.println("Class C");
    }
}

public class multilevelInheritance {
    public static void main(String[] args) {
        C item=new C();
        item.cat();
        item.ball();
        item.ant();
    }
}
