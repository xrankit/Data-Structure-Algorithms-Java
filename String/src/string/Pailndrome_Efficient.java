package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pailndrome_Efficient 
{
	public static boolean isPalindrome(String str)
	{
		int begin = 0;
		int end = str.length()-1;
		while(begin<end)
		{
			if(str.charAt(begin)!= str.charAt(end))
			{
				return false;
			}
			begin++;
			end--;
		}
		return true;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		if(isPalindrome(str))
		{
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
	}

}
