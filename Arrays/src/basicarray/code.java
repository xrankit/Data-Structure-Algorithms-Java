package basicarray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class code {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] Input = br.readLine().split(" ");
        int n = Integer.parseInt(Input[0]);
        int k = Integer.parseInt(Input[1]);
     
		int arr[] = new int[n];
		for(int i = 0; i<n;i++)
		{
			arr[i] = Integer.parseInt(br.readLine());
		}
		int mn = Integer.MAX_VALUE;
		Arrays.sort(arr);
		for(int i = k; i<n+1; i++)
		{
			mn = Math. min(mn, (arr[i-1]-arr[i-k]));
		}
		System.out.println(mn);
	}
}

