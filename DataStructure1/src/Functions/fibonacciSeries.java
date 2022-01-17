package Functions;

import java.util.Scanner;
public class fibonacciSeries {
	
	public static boolean fibo(int n)
	{
		int a = 0;
		int b = 1;
		int fib = 0;
		for(int i =0;i<=n-2;i++)
		{
			fib = a+b;
			if(fib == n)
			{
				return true;
			}
			a = b;
			b = fib;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean b = fibo(n);
		System.out.println(b);
	}

}
