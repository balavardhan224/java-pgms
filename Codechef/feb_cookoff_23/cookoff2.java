package Codechef.feb_cookoff_23;


/* package codechef; // don't place package name! */

import java.util.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef4
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try (// your code goes here
		Scanner aa = new Scanner(System.in)) {
			int a=aa.nextInt();
			while(a>0){
			    a-=1;
			    int b=aa.nextInt();
			    int c=aa.nextInt();
			    int d=aa.nextInt();
			    int t=aa.nextInt();
			    // System.out.println(b+c);
			    if((b+c)>=t || (b+d)>=t || (c+d)>=t){
			        System.out.println("YES");
			    }
			    else{
			        System.out.println("NO");
			    }
			}
		}
	}
}
