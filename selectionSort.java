public class selectionSort {
    public static void main(String[] args) {
        int array[]={3,1,99,66,2};
        for(int i=0;i<4;i++){
            int min=i;
            for(int j=i+1;j<5;j++){
                if(array[min]>array[j]){
                    min=j;
                }
            }
            int temp=array[min];
            array[min]=array[i];
            array[i]=temp;
        }
        for(int i=0;i<4;i++){
            System.out.print(array[i]+" ");
        //System.out.print();
    }
    }
}
