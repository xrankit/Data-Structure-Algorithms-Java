package day2;

import java.util.Scanner;
public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter lowest value");
		int low = sc.nextInt();
		System.out.println("enter highest value");
		int high = sc.nextInt();
		
		for(int i =low; i<=high; i++)
		{
			int flag = 0;
			for(int j =2; j*j<=i;j++)
			{
				if(i%j==0)
				{
					flag++;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println(i);
			}
		}
		
	}

}
