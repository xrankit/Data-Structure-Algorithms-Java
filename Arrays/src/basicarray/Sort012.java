package basicarray;

import java.util.Scanner;

public class Sort012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0) 
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i =0;i<n;i++)
			{
				arr[i] = sc.nextInt();
			}
			int count0 =0;
			int count1 = 0;
			int count2 =0;
			for(int i=0;i<n;i++)
			{
				if(arr[i]==0)
				{
					count0++;
				}
				else if(arr[i]==1)
				{
					count1++;
				}
				else
				{
					count2++;
				}
			}
			for(int i =0;i<count0;i++)
			{
				System.out.print("0"+" ");
			}
			for(int i =0;i<count1;i++)
			{
				System.out.print("1"+" ");
			}
			for(int i =0;i<count2;i++)
			{
				System.out.print("2"+" ");
			}
		}
	}

}
