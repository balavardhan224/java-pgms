import java.util.Set;
import java.util.TreeSet;

class Solution3 {
    public boolean containsDuplicate(int[] nums) {
        Set <Integer> set =new TreeSet<Integer>();
        for(int i:nums){
            set.add(i);
        }
        if(nums.length==set.size()) return false;
        else return true;
    }
}