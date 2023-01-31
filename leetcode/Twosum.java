package leetcode;


class Solution {
    public int[] twoSum(int[] nums, int target) {
        int result[]= new int[2];
        for(int i=0;i<nums.length;i++){
            for(int k=1+i;k<nums.length;k++){
                if(nums[i]+nums[k] == target){
                    result[0]=i;
                    result[1]=k;
                    
                }
            }
        }
        return result;
    }
}