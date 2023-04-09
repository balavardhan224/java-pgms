import java.util.HashMap;

class anagram {
    public boolean isAnagram(String s, String t) {
        HashMap< Character, Integer> h=new HashMap<>();
        int f=s.length();
        int l=t.length();
        if(f!=l) return false;
        for(int i=0;i<f;i++){
            char a=s.charAt(i);
            char b=t.charAt(i);
            h.put(a,h.getOrDefault(a,0)+1);
            h.put(b,h.getOrDefault(b,0)-1);
        }
        for(int i:h.values()){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
}