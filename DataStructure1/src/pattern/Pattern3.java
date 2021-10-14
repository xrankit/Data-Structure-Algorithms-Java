package pattern;

import java.util.Scanner;
public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i<n; i++)
		{
			for(int j=2*(n-i);j>0;j--)
			{
				System.out.print("\t");
			}
			for(int k = 0; k<=i; k++ )
			{
			System.out.print("*\t");
			}
			System.out.println();
		}

	}

}
