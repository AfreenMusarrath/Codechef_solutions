/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
		static void vel(int u, int v ,int a ,int s)
		{
		    
		     if((u*u-v*v)<=2*a*s) System.out.println("Yes");
		    else System.out.println("No");
		}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		while (n-- !=0){
		   int u=sc.nextInt();
		   int v=sc.nextInt();
		     int a=sc.nextInt();
		   int  s=sc.nextInt();
		   if(u<=v) System.out.println("Yes");
		   else
		    vel(u,v,a,s);
		}
		
		
	}
	
}
