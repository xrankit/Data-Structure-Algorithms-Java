package pattern;

import java.util.Scanner;

public class pattern25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		11111
//		 2222
//		  333
//		   44
//		    5
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i =1;i<=n;i++)
		{
			for(int j = 0;j<i-1;j++)
			{
				System.out.print(" ");
			}
			for(int j =n-i+1;j>0;j--)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
