package OOPS.inheritance;
// package oops.inheritance;
class Aq{
    void ant(){
        System.out.println("Class A");
    }
}
class Bq extends Aq{
    void ball(){
        System.out.println("Class B");
    }
}
class C extends Aq{
    void cat(){
        System.out.println("Class C");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        C item= new C();
        item.ant();
        item.cat();
    }
}
