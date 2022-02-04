package recursion1a;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountZeros 
{
	public static void CountZero(int n)
	{
		if(n==0)
		{
			return;
		}
		int r = n%10;
		CountZero(n/10);
		if(r==0)
		{
			System.out.println(r);
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		CountZero(n);
	}

}
