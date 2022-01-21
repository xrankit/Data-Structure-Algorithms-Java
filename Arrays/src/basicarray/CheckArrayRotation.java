package basicarray;

import java.util.Scanner;

public class CheckArrayRotation {
	
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
			int count = 1;
			int i = 0;
			int j = i + 1;
			while (i<n && j< n)
			{
				if(arr[i++]<arr[j++])
				{
					count++;
				}
				else
				{
					break;
				}
			}
			if(count!= n)
			{
			System.out.println(count);
			}
			else
			{
				System.out.println(count-n);
			}
		}
	}

}
