class insertionSort {
    public static void main(String[] args) {
        int array[]={7,0,2,1,8,4};
        for(int i=1;i<array.length;i++){
            int key=array[i];
            int j=i-1;
            while(j>=0 && array[j]>key){
                array[j+1]=array[j];
                j-=1;
            }
            array[j+1]=key;
        }
        for(int i=0;i<6;i++){
            System.out.println(array[i]);
        }

    }
}
