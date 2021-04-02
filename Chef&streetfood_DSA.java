/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static int chef(int s, int p, int v, int max)
	    {
	        int x=p/(s+1);
	        int profit=v*x;
	        if(profit>max)
	            max=profit;
	        return max;
	        
	    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		 
		for(int i=0;i<t;i++)
		{
		    int max=0;
		    int n=sc.nextInt();
		    while(n-- != 0)
		    {
		        int s=sc.nextInt();
		        int p=sc.nextInt();
		        int v=sc.nextInt();
		       max= chef(s,p,v,max);
		    }
		    System.out.println(max);
		}
	}
}
