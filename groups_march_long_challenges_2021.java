/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{ 
    static void groups(String s)
    {
        int count=0;
        for(int i=0;i<s.length();i++)
        {
        if(i==s.length()-1 && s.charAt(i)=='1') count++;
        else  if(s.charAt(i)=='1'&&s.charAt(i+1)=='0')
            count++;
        }
        System.out.println(count);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        sc.nextLine();
        while(n-- != 0){
            String m=sc.nextLine();
            groups(m);
        }
        

}
}
	
