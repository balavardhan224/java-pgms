
package leetcode;
import java.util.HashSet;
import java.util.Set;


class RemoveDuplicates {
    public static void main(String[] args) {
        int a[]={1,1,2};
        Set<Integer> set=new HashSet<Integer>();
        for (int i=0;i<a.length;i++){
            set.add(a[i]);
        }
        System.out.println(set);
        System.out.println(set.size());
    }
}
