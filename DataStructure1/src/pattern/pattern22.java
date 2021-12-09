package pattern;

import java.util.Scanner;

public class pattern22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		for(int i=1;i<=n;i++)
		{
			for(int j = 1;j<=n;j++)
			{
				System.out.print(count+" ");
				count = count +1;
			}
			System.out.println();
		}
	}

}
