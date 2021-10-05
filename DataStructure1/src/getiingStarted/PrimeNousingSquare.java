package getiingStarted;

import java.util.Scanner;
public class PrimeNousingSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++)
		{
			int N = sc.nextInt();
			int count =0;
			for(int j =2;j*j<=N;j++)
			{
				if(N%j==0)
				{
					count++;
				}
			}
			if(count==0)
			{
				System.out.println("Prime Number");
			}
			else
			{
				System.out.println("Non Prime Number");
			}
		}
	}

}
