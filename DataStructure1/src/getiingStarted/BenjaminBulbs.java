package getiingStarted;

import java.util.Scanner;
public class BenjaminBulbs {
	  public static void main(String[] args)
	  {
		    // write your code here 
		    Scanner sc = new Scanner(System.in);
		    long num = sc.nextInt();
		    for(long i =1;i<=num;i++)
		    {
		        if(i*i <=num) 
		        {
		            System.out.println(i*i);
		        }
		    }
	  }

}
