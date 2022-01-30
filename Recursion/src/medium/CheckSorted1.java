package medium;

import java.util.Scanner;

public class CheckSorted1 {
	
	public static boolean CheckSorted(int arr[])
	{
		if(arr.length<=1)
		{
			return true;
		}
		
		if(arr[0] > arr[1])
		{
			return false;
		}
		
		int arr1[] = new int[arr.length-1];
		for(int i=1;i<arr.length;i++)
		{
			arr1[i-1] = arr[i];
		}
		boolean smallAns = CheckSorted(arr1);
		return smallAns;
//		if(smallAns)
//		{
//			return true;
//		}
//		else
//		{
//			return false;
//		}
		
		
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
		System.out.println(CheckSorted(arr));
	}

}
