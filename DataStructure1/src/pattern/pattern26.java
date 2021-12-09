package pattern;

import java.util.Scanner;

public class pattern26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		12345
//		 2345
//		  345
//		   45
//		    5
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i =1;i<=n;i++)
		{
			for(int j =0;j<i-1;j++)
			{
				System.out.print(" ");
			}
			int count = i-1;
			for(int j = n-i+1;j>0;j--)
			{
				count = count + 1;
				System.out.print(count);
			}
			System.out.println();
		}
	}

}
