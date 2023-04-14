package OOPS.polymorphism;
class An{  
        String color="white";  
        } 
class Ba extends An{  
    String color="black";  
    void ant(){  
    System.out.println(color);//prints color of Dog class  
    System.out.println(super.color);//prints color of Animal class  
    }  
    }  
class TestSuper1{  
    public static void main(String args[]){  
    Ba d=new Ba();  
    d.ant();  
    }}  