package medium;

import java.util.Scanner;

public class FirstIndex {
	
	public static int firstIndex(int arr[], int idx, int x)
	{
		if(idx == arr.length)
		{
			return -1;
		}
		
		if(arr[idx]==x)
		{
			return idx;
		}
		else
		{
			int fiX = firstIndex(arr,idx +1,x);
			return fiX;
		}
		
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
		
		int fI = firstIndex(arr,0,x);
		System.out.println(fI);
	}

}
