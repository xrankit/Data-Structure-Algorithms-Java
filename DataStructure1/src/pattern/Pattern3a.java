package pattern;

import java.util.Scanner;
public class Pattern3a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int space = n-1; 
		int star = 1;
		for(int i =0;i<n;i++)
		{
			for(int j = 0;j<space;j++)
			{
				System.out.print("\t");
			}
			
			for(int j = 0;j<star;j++)
			{
				System.out.print("*\t");
			}
			space--;
			star++;
			System.out.println();
		}
	}

}
