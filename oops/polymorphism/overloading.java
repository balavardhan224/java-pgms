package OOPS.polymorphism;

class A{
    int ant(int a, int b,int c){
        return (a+b+c);
    }
    int ant(int a, int b){
        return (a+b);
    }
}
public class overloading {
    public static void main(String[] args) {
        A item=new A();
        var a=item.ant(2,3);
        System.out.println(a);
        var b=item.ant(2,3,5);
        System.out.println(b);
    }
}
