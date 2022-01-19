package basicarray;

import java.util.Arrays;
import java.util.Scanner;

public class Tripletsum1 {
//	1. Sort all element of array
//	2. Run loop from i=0 to n-2.
//	     Initialize two index variables l=i+1 and r=n-1
//	4. while (l < r) 
//	     Check sum of arr[i], arr[l], arr[r] is
//	     given sum or not if sum is 'sum', then print 
//	     the triplet and do l++ and r--.
//	5. If sum is less than given sum then l++
//	6. If sum is greater than given sum then r--
//	7. If not exist in array then print not found.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i =0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int temp = sc.nextInt();
		int count = 0;
		for(int i =0;i<n-2;i++)
		{
			int l = i+1;  int r = n-1;
			while(l<r)
			{
				if((arr[i]+arr[l]+arr[r])==temp)
				{
					count++;
					l++;
					r--;
				}
				else if((arr[i]+arr[l]+arr[r]) < temp)
				{
					l++;
				}
				else
				{
					r--;
				}
			}
		}
		System.out.println(count);
	}

}
