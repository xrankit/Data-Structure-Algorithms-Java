package basicarray;

import java.util.Scanner;

public class SecondLargestinarray {

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
			int large = Math.max(arr[0], arr[1]);
			int secLarge =Math.min(arr[0], arr[1]);
			
			for(int i = 2; i<n; i++)
			{
					if(large < arr[i])
					{
						secLarge = large;
						large = arr[i];
					}
					else if(large > arr[i] && arr[i]> secLarge)
					{
						secLarge = arr[i];
					}
			}
			System.out.println(large +" " +secLarge);
				
		}
	}

}
