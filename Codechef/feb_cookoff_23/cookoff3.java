package Codechef.feb_cookoff_23;

/* package codechef; // don't place package name! */

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef3
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try (// your code goes here\\
        Scanner aa = new Scanner(System.in)) {
            int a=aa.nextInt();
            while(a>0){
                a-=1;
                int b=aa.nextInt();
                String c=aa.next();
                HashSet<Character> d= new HashSet<>();
                for(int i=0;i<c.length()-1;i++)
                {d.add(c.charAt(i));}
                System.out.println(d.size());

                if(d.size()==b){
                    System.out.println(-1);
                }
                else System.out.println(b-2);
            }
        }
	}
}
