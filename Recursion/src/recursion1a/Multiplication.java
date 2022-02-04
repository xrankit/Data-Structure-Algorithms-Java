package recursion1a;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Multiplication 
{
	public static int Multiplications(int n,int x)
	{
		int result = n*x;
		return result;
	}

	public static void main(String[] args) throws NumberFormatException, IOException  {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int x = Integer.parseInt(br.readLine());
		System.out.println(Multiplications(n,x));
		
	}

}
