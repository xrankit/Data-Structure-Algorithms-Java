package getiingStarted;

import java.util.Scanner;
public class CountnumberOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i =0;i<t;i++) 
		{
			int num = sc.nextInt();
			int count=0;
			for(int j=num;j>0;j=j/10)
			{
				count++;
			}
			System.out.println(count);
		}
	}

}
