package recursion1a;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GeometricSum 
{	
	public static double geometricSum(int n)
	{
		if(n<0)
		{
			return 0;
		}
		else
		{
			return 1/Math.pow(2,n) + geometricSum(n-1);
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
//		Problem Name: Geometric Sum
//		Problem Level: MEDIUM
//		Problem Description: #### Given k, find the geometric sum i.e. 
//		    1 + 1/2 + 1/4 + 1/8 + ... + 1/(2^k) 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println(geometricSum(n));
	}

}
