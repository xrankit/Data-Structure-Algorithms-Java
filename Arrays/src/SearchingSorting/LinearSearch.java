package SearchingSorting;

import java.util.Scanner;

public class LinearSearch {
	
	public static int LinearSearch(int arr[], int x)
	{
		int n = arr.length;
		 for(int i =0;i<n;i++)
		 {
			 if(arr[i]==x)
			 {
				 return i;
			 }
		 }
		 return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i =0; i<n ;i++)
			{
				arr[i] = sc.nextInt();
			}
			int x = sc.nextInt();
			int pos = LinearSearch(arr, x);
			System.out.println(arr[pos]);
			System.out.println(pos);
			
		}
	}

}
