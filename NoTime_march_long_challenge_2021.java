/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int h=sc.nextInt();
		int x=sc.nextInt();
		int count=0;
		while(n-- != 0){
		   int a=sc.nextInt();
		    if(a+x==h)
		    {
		        count=0;
		        System.out.println("Yes");
		        break;
		    }
		    else count++;
		}
		if(count>0) System.out.println("No");
	}
}
