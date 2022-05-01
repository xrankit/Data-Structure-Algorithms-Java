package string;
import java.util.*;
public class Palindrome_NaiveMethod 
{
	public static boolean isPalindrome(String str)
	{
		StringBuilder revstr = new StringBuilder(str);
		revstr.reverse();
		return str.equals(revstr.toString());
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		if(isPalindrome(str))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("not Palindrome");
		}
	}

}
