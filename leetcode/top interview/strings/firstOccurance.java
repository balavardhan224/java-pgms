class firstOccurance {
    public int strStr(String f, String s) {
    
    int fl=f.length();
        int sl=s.length();
        if(fl<sl){
            return -1;
        }
        for(int i=0;i<=fl-sl;i++){
            for(int j=0;j<sl;j++){
                if(s.charAt(j)==f.charAt(i+j)){
                    //  System.out.print("i"+i);
                    //   System.out.println("j"+j);
                    if(j==sl-1){
                    return i;
                }
                    // System.out.print("l");
                }
                
                else{
                    break;
                }
                
               
            }
        }
        return -1;
    }
}