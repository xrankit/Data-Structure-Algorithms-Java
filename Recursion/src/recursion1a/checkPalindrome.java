package recursion1a;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class checkPalindrome 
{
	public static boolean isPalindrome1(String str)
	{
		int i = 0, j = str.length() - 1;
        while (i < j) 
        {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		if(isPalindrome1(str))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}
	}

}
