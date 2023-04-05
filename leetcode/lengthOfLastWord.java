package leetcode;


class Solution2 {
    public int lengthOfLastWord(String s) {
        if(s==null || s.length() == 0)
            return 0;
        String p=s.trim();
        int c=0;
        for(int i=p.length()-1;i>=0;i--){
           if(p.charAt(i)!=' '){
                c+=1;
            }
            else{
                break;
            }
        }
        return c;
    }
}