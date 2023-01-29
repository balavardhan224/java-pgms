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

class C extends A{
    void cat(){
        System.out.println("Class C");
    }
}
class D extends B{
    void dog(){
        System.out.println("Class D");
    }
}


public class HybridInheritance {
    D item= new D();
    // item.dog();
}
