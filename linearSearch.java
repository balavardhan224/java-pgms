import java.util.*;
class lS{
    static int search(int array[],int n){
        for(int i=0;i<array.length;i++){
            if(n==array[i]){
                System.out.println("number located in "+i+"th index");
               
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        try (Scanner a = new Scanner(System.in)) {
            int array[]={1,2,3,4,5};
            System.out.println("search element");
            int n=a.nextInt();
            int p=search(array,n);
            if (p==-1){
                System.out.println("not found");
            }
            // else{
            //     System.out.println("NOT FOUND");
            // }
        }
       

    }
}