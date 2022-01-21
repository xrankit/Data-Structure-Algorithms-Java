
package basicarray;

import java.util.Scanner;

public class Rotatearray {
	
	public static void rotateArray(int arr[], int n )
	{
		int temp = arr[0];
		for(int i =0;i<n-1; i++)
		{
			arr[i] = arr[i+1];
		}
		arr[n-1] = temp;
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0) 
		{
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i =0;i<n;i++)
			{
				arr[i] = sc.nextInt();
			}
			int d = sc.nextInt();
			
			for(int i =0; i<d;i++)
			{
				rotateArray(arr, n);
			}
			
			for (int i = 0; i < n; i++)
			{
	            System.out.print(arr[i] + " ");
			}
		}
	}

}
