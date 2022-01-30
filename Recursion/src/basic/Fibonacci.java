package basic;

import java.util.Scanner;

public class Fibonacci 
{	
	public static int fibonacciNumber(int n)
	{
		if(n==0)
		{
			return 0;
		}
		else if(n==1)
		{
			return 1;
		}
		
		return fibonacciNumber(n-1) + fibonacciNumber(n-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(fibonacciNumber(n));
	}

}
