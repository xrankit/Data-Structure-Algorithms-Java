package SearchingSorting;

import java.util.Scanner;

public class binarySearch {
	
	public static int binarySearch(int arr[], int x) 
	{
		int start = 0;
		int end = arr.length-1;
		int mid = (start + end)/2;
		if(arr[mid] == x)
		{
			return mid;
		}
		else if(arr[mid]>x)
		{
			end = mid-1;
		}
		else
		{
			start = mid+1;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i =0; i<n ;i++)
		{
			arr[i] = sc.nextInt();
		}
		int t = sc.nextInt();
		while(t>0)
		{
			int x = sc.nextInt();
			int pos = binarySearch(arr, x);
			System.out.println(arr[pos]);
			System.out.println(pos);
			
		}
		
	}

}
