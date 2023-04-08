

class stringrev {
    public void reverseString(char[] s) {
        int a=0;
        int b=s.length-1;
        while(a<b){
            char t=s[a];
            s[a]=s[b];
            s[b]=t;
            a+=1;
            b-=1;
        }
    }
}