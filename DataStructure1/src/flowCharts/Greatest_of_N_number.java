package flowCharts;

import java.util.*;
public class Greatest_of_N_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[]arr = new int[N];
		int largest = -10000;
		
		for(int i = 0;i<N;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i<N;i++)
		{
			if(arr[i]>=largest)
			{
				largest = arr[i];
			}
		}
		System.out.println("the largest of "+ N + " number is "+ largest);
		
	}

}
