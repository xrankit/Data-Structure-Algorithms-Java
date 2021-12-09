package pattern;

import java.util.Scanner;

public class pattern27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i =1;i<=n;i++)
		{
			for(int j =n-1;j>i-1;j--)
			{
				System.out.print(" ");
			}
			int count =0;
			for(int j =1;j<=i;j++)
			{
				count = count +1;
				System.out.print(count);
			}
			int count1=0;
			for(int j = 1;j<i;j++)
			{
				count1 = count1 +1;
				System.out.print(count1);
			}
			System.out.println();
		}

	}

}
