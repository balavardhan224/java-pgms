public class removeElement {
    public static void main(String[] args) {
        int nums[]={1,2,3,2,7};
        int t=2;
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(t != nums[i]){
                nums[j]=nums[i];
                j++;
            }
            
        }
        for(int p:nums){
            System.out.println(p);
        }
    }
}
