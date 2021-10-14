package getiingStarted;

import java.util.Scanner;
public class PythagoreanTriplet 
{
	  public static void main(String[] args) 
	  {
	    // write your code here  
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    int c = sc.nextInt();
	    if(a*a + b*b == c*c)
	    {
	        System.out.println("true");
	    }
	    else if(c*c + b*b == a*a)
	    {
	        System.out.println("true");
	    }
	    else if(c*c + a*a == b*b)
	    {
	        System.out.println("true");
	    }
	    else
	    {
	        System.out.println("false");
	    }
	   }
}
