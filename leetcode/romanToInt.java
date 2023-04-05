package leetcode;


class romanToInt{
    public static void main(String[] args) {
        String a="IV";
        
        System.out.println(a);
        int res=0;
        for(int i=0;i<a.length();i++){
            char c=a.charAt(i);
            if(c=='I'){
                if(
                    (i+1<a.length() && (a.charAt(i+1)=='V' || a.charAt(i+1)=='X') )) {
                   res-=1;
                }
                else{
                    res+=1;
                }
            }
            if(c=='V'){
                if(
                    (i+1<a.length() && (a.charAt(i+1)=='X' || a.charAt(i+1)=='L') )) {
                   res-=5;
                }
                else{
                    res+=5;}}
            if(c=='X'){
                if(
                    (i+1<a.length() && (a.charAt(i+1)=='L' || a.charAt(i+1)=='C') )) {
                   res-=10;
                }
                else{
                    res+=10;}}
            if(c=='L'){
                if(
                    (i+1<a.length() && (a.charAt(i+1)=='C' || a.charAt(i+1)=='D') )) {
                   res-=50;
                }
                else{
                    res+=50;}}
            if(c=='C'){
                if(
                    (i+1<a.length() && (a.charAt(i+1)=='D' || a.charAt(i+1)=='M') )) {
                   res-=100;
                }
                else{
                    res+=100;}}
            if(c=='D'){
                res=res+500;}
                if(c=='M'){
                    res=res+1000;
                }
              
        
        
        
    }
}
}