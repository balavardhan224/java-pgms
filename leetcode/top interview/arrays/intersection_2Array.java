import java.util.*;

class intersection_2Array {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap <Integer,Integer> h1= new HashMap<>();
        HashMap <Integer,Integer> h2= new HashMap<>();
        List <Integer> l = new ArrayList<Integer>();
        
        for(int i:nums1){
            if(h1.containsKey(i)){
                h1.put(i,h1.get(i)+1);
            }
            else{
                h1.put(i, 1);
            }
        }
        for(int j:nums2){
            if(h2.containsKey(j)){
                h2.put(j,h2.get(j)+1);
            }
            else h2.put(j,1);
        }
        
        for (int k: h1.keySet()){
            if(h2.containsKey(k)){
               int m=Math.min(h1.get(k),h2.get(k));
                while(m-->0){
                    l.add(k);
                }
                
            }
        }
        int[] res=new int[l.size()];
        for(int p=0;p<l.size();p++){
            res[p]=l.get(p);
        
    }
        return res;
}
}