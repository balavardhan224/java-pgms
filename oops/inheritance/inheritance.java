package oops.inheritance;


class extra{
    int a=23;
}

class Inheritance extends extra{
    float marks=(float) 10.51;

    public static void main(String[] args) {
       
        Inheritance i=new Inheritance();
        System.out.println(i.a);
        System.out.println(i.marks);


    }
    
}
