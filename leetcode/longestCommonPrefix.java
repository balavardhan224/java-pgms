class largestCommonPrefix {
    public static void main(String[] args) {
        
    String[] strs={"flala","flalaaaaa","flight"};
    String p=strs[0];
    // System.out.println((strs[0].length()));
    // System.out.println((strs[0].length()-1));
    // System.out.println(strs[1].indexOf(strs[0]));
    // System.out.println(strs[0].substring(0, strs[0].length() - 1));
    for(int i=1;i<strs.length;i++){
        System.out.println("strs: "+ strs[i]);
        System.out.println("codition "+ strs[i] + "index of " + p +"="+strs[i].indexOf(p)) ;
        System.out.println(strs[i].indexOf(p)!=0);
        while(strs[i].indexOf(p)!=0){
            System.out.println(p);
            p=p.substring(0,p.length()-1);
            System.out.println("after -1"+ p);
        }
    }
    System.out.println(p);
      
    }
}