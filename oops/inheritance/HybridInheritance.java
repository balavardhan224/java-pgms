package OOPS.inheritance;
// package oops.inheritance;
class A2{
    void ant(){
        System.out.println("Class A");
    }
}
class B2 extends A2{
    void ball(){
        System.out.println("Class B");
    }
}

class C2 extends A2{
    void cat(){
        System.out.println("Class C");
    }
}
class D2 extends B2{
    void dog(){
        System.out.println("Class D");
    }
}


class Hybrid{
    public static void main(String args[]){  
        D2 item1= new D2();
        item1.ant();
        item1.ball();
        item1.dog();
        
    }
}
