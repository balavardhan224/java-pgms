public class bubbleSort {
    public static void main(String[] args) {
        int array[]={7,3,99,2,8};
        for(int i=0;i<5;i++){
            for (int j=0;j<5-i-1;j++){
                if(array[j]>array[j+1]){
                    int temp= array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        for(int i=0;i<5;i++){
            System.out.print(array[i]+" ");
        }
    }
}
