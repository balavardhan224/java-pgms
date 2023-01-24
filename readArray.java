import java.util.*;
class bala{
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int[] array= new int[10];
        for(int i=0;i<5;i++){
            array[i]=a.nextInt();
        }
        System.out.println("inserted");
        for(int i=0;i<5;i++){
            System.out.println(array[i]);
        }
    }
}