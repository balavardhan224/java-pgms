
class atoi {
    public int myAtoi(String s) {
    s=s.trim();
    //int sign=1;
    if (s.length()==0) return 0;
    int MAX = Integer.MAX_VALUE, MIN = Integer.MIN_VALUE;
    int sign =(s.charAt(0)=='-')?-1:1;
    long res=0;
    

    int i =(s.charAt(0)=='-'||s.charAt(0)=='+')?1:0;
    while(i<s.length()){
        if (s.charAt(i)==' ' || !Character.isDigit(s.charAt(i))) break;
        res=res*10+s.charAt(i)-'0';
        if(sign == -1 && -1*res < MIN) return MIN;
        if(sign == 1 && res > MAX) return MAX;
        i++;
    }
        return (int)res*sign;
    }
}