import java.util.HashMap;

class FirstuniqueSolution {
    public int firstUniqChar(String s) {
    HashMap<Character, Integer> h=new HashMap<Character, Integer>();
    //int l=s.length;
    for(char i:s.toCharArray()){
        h.put(i,h.getOrDefault(i,0)+1);
    }
    int i=0;
    for(char j:s.toCharArray()){
        if(h.get(j)==1){
            return i;
        }
        i+=1;
    }
        return -1;
    }
}