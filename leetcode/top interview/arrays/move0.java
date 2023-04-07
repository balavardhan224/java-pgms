
class move0 {
    public void moveZeroes(int[] nums) {
    int lt=nums.length;
    int l=0;
    int r=1;
    while(r<lt){
        if(nums[l]!=0){
            r++;
            l++;
        }
        else if(nums[r]==0){
            r++;
        }
        else{
            int t=nums[l];
            nums[l]=nums[r];
            nums[r]=t;
        }
    }
    }
}