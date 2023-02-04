 class minNumber {
    public static void main(String[] args) {
        int a[]={8,7,99,11,1};
        int min=a[0];
        for(int i=0;i<a.length;i++){
            if(min>a[i]){
                min=a[i];
            }
        }
        System.out.println(min);
    }
}
