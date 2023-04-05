import java.util.Set;
import java.util.TreeSet;

class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set=new TreeSet<Integer>();
        for (int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int k=0;
        for(int l:set){
            nums[k]=l;
            k++;
        }
        return set.size();
    }
}