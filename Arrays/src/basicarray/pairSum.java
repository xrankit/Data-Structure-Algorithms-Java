package basicarray;

import java.util.Arrays;
import java.util.Scanner;

public class pairSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr1[] = new int[n];
		for(int i =0;i<n;i++)
		{
			arr1[i] = sc.nextInt();
		}
		Arrays.sort(arr1);
		
		int temp = sc.nextInt();		
		int count = 0;
		for (int i = 0; i < arr1.length; i++)
		{
            for (int j = i + 1; j < arr1.length; j++)
            {
                if ((arr1[i] + arr1[j]) == temp)
                {
                    count++;
                }
            }
		}
        System.out.println("Count of pairs is "+ count);
	}

}
