
package leetcode;
import DSA.main;

public class plusOne {
    public static void main(String[] args) {
        int digits[]={9,9,9};
        int n=digits.length;
        
        for(int i=digits.length-1;i>=0;i--){
           // System.out.println(digits[i]);
            if(digits[i]<9){
                
                digits[i]++;
                //System.out.println(digits[i]);
                break;
               // System.out.println(digits[i]);
                
            }
            digits[i]=0;


        }

        for(int i:digits){
            System.out.println(i);
        }
        System.out.println("check");
        int[] newNumber = new int [n + 1];
        newNumber[0] = 1;
        
        // // for(int i:digits){
        // //     System.out.println(i);
        // }
        }
    
}
