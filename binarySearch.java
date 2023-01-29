import java.util.*;

class binarySearch {
    static int b(int array[],int b,int initial,int last){
        
        if(last>=initial){
            int mid=initial+(last-initial)/2;
        if (b==array[mid]){
            return mid;
        }
        else if(b<array[mid]){
            return b(array, b,initial, mid-1);}
            
        else {
            return b(array, b, mid+1, last);
        }
        }
        return -1;
    }
    public static void main(String[] args) {
        int array[]={1,2,3,4,5};
        try (Scanner a = new Scanner(System.in)) {
            System.out.println("srch element");
            int b=a.nextInt();
            int c=b(array,b,0,array.length-1);
            if (c==-1){
                    System.out.println("not found");
   }
            else{
                System.out.println(b);
            }
        }       
    }
}
