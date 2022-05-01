package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String_Subsequence {
	
	public static boolean is_Subsequence(String str1, String str2, int m, int n)
	{
		int j =0;
		for(int i=0;i<m && j<n; i++)
		{
			if(str1.charAt(i)==str2.charAt(j))
			{
				j++;
			}
		}
		return(j==n);
	}
	
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		String str1 = br.readLine();
		String str2 = br.readLine();
		int m = str1.length();
		int n = str2.length();
		if(is_Subsequence(str1, str2, m, n))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
		
	}

}
