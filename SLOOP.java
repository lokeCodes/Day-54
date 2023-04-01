// https://www.codechef.com/problems/SLOOP
// Question Link^^^


import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-- > 0){
		    int m = s.nextInt();
		    int so = s.nextInt();
		    if(m<so){
		        System.out.println(0);
		    }else if(m>=so){
		        System.out.println(m/so);
		    }
		}
	}
}
