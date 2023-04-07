import java.util.HashMap;
import java.util.Map;

class twosum1 {
    public int[] twoSum(int[] nums, int target) {
    int[] res=new int[1];
    for(int i=0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
            if(nums[i]+nums[j]==target){
                res[0]=i;
                res[1]=j;
            }
        }
    }
        return res;
    }
}
//approach 2
class twosum2 {
    public int[] twoSum(int[] nums, int target) {
    Map <Integer,Integer> h=new HashMap<>();
    for(int i=0;i<nums.length;i++){
        int c= target-nums[i];
        if(h.containsKey(c)){
            return new int[] {h.get(c),i};
        }
        h.put(nums[i],i);
    }
       throw new IllegalArgumentException("no match found");
    }
}