// https://www.codechef.com/problems/COCONUT
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
		    int a = s.nextInt();
		    int b = s.nextInt();
		    int xa = s.nextInt();
		    int xb = s.nextInt();
		    int res1 = xa/a;
		    int res2 = xb/b;
		    System.out.println(res1+res2);
		}
	}
}
