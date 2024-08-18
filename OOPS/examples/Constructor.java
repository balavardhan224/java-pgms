package OOPS.examples;

public class Constructor {
    int a;
    Sting b;
    initialise(int value, String word){
        a=value;
        b=word;
    }
    display(
        System.out.println(a+" "+b);
    )
    public static void main(String[] args) {
        Constructor s1= new Constructor(1,"bala");
        Constructor s2=new Constructor(2,"lol");
        s1.diplay();
        s2.display();
    }
}
