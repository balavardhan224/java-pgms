
class validPalindrome {
    public boolean isPalindrome(String s) {
    String rev="";
    for (char i:s.toCharArray()){
        if(Character.isDigit(i) || Character.isLetter(i)){
            rev+=i;
        }
    }
    rev=rev.toLowerCase();
    int a=0;
    int l=rev.length()-1;
    while(a<=l){
       if( rev.charAt(a)!=rev.charAt(l)){
           return false;
       }
        a+=1;
        l-=1;
    }
        return true;
    }
}