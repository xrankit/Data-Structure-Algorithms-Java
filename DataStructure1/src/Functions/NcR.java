package Functions;

import java.util.Scanner;
public class NcR {

	public static int factorial(int n)
	{
		int fact = 1;
		for(int i =1;i<=n;i++)
		{
			fact = fact * i;
		}
		return fact;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
//		int fact_num = 1;
//		for(int i =1;i<=n;i++)
//		{
//			fact_num = fact_num * i;
//		} 
//		System.out.println(fact_num);
//		
//		int fact_den1 = 1;
//		int fact_den2 = 1;
//		for(int i =1;i<=r;i++)
//		{
//			fact_den1 = fact_den1 * i;
//		}
//		System.out.println(fact_den1);
//		
//		for(int i = 1;i<= n-r;i++)
//		{
//			fact_den2 = fact_den2 * i;
//		}
//		
//		System.out.println(fact_den2);
		int fact_num =factorial(n);
		int fact_den1 = factorial(r);
		int fact_den2 = factorial(n-r);
		 int nCr = fact_num/(fact_den1 * fact_den2);
		 System.out.println(nCr);
	}

}
