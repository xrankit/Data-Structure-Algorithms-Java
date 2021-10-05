package getiingStarted;

import java.util.Scanner;
public class PrimeNumberUsingNormal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number od test cases");
		int t = sc.nextInt();
		for(int i = 0; i<=t;i++)
		{
			System.out.println("Enter the number : ");
			int N = sc.nextInt();
			int count = 0;
			for(int j =1;j<=N;j++)
			{
				if(N%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(N+ " is a prime number");
			}
			else
			{
				System.out.println(N + " is not a prime number");
			}
		}
			
			
	}

}
