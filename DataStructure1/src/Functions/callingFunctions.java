package Functions;

import java.util.Scanner;

public class callingFunctions {
	
	public static boolean primeOrNot(int n)
	{
		for(int i =2;i<n;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	
	public static void printPrime(int n)
	{
		for(int i =2;i<n;i++)
		{
			boolean isPrime = primeOrNot(i);
			if(isPrime)
			{
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printPrime(n);
	}

}
