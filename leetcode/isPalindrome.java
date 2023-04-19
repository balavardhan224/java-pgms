package leetcode;

// package leetcode;

class Solution1 {
    public static void main(String[] args) {
        int temp = 121;
        int r=0;
        int sum=0;
        while(temp>0){
            r=temp%10;
            sum=sum*10+r;
            temp=temp/10;
          System.out.println(sum);
        }
           System.out.println(sum);
           if(sum==121){
               System.out.println("true");
           }
              else{
                    System.out.println("false");
              }
    }
}