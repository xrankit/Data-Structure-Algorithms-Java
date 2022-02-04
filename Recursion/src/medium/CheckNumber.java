package medium;

import java.util.Scanner;

public class CheckNumber {
	
	public static boolean checkNumber(int arr[],int n, int x)
	{
		if(arr.length <= 0 )
		{
			return false;
		}
		for(int i =0; i<arr.length; i++)
		{
			if(arr[i]==x)
			{
				return true;
			}
		}
		return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i =0; i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int x = sc.nextInt();
		System.out.println(checkNumber(arr, n, x));
	}

}
