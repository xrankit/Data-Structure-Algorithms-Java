package pattern;

import java.util.Scanner;

public class pattern17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i =n;i>0;i--)
		{
			for(int j = i-1;j>0;j--)
			{
//				System.out.print("  ");
			}
			System.out.println("*");
		
			for(int j =0;j<n-i;j++)
			{
//				System.out.print("  ");
			}
			System.out.println("*");
		}
	}

}
