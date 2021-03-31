/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static void manipulate(int[] q, int a, int b)
    {
         if(a<=0) a=1;
         q[a]+=1;
		   if(b<q.length-1) q[b+1]-=1;
    }
    static void zoombies(int[] c, int[] h)
    {
        int n=c.length;
        int q[]=new int[n];
		for(int i=1;i<n;i++)
		{
		   manipulate(q,i-c[i],i+c[i]);
		}
		for(int i=2;i<n;i++)
		{
		    q[i]=q[i-1]+q[i];
		}
		
	Arrays.sort(q);
    Arrays.sort(h);
    
    if(Arrays.equals(q, h)) System.out.println("YES");
    else System.out.println("NO");
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s= new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++)
		{
		    int n=s.nextInt();
		    n++;
		    int c[]=new int[n];
		    int h[]=new int[n];
		    for(int j=1;j<n;j++) c[j]=s.nextInt();
		    for(int j=1;j<n;j++) h[j]=s.nextInt();
		    
		    zoombies(c,h);
		}
}
}
