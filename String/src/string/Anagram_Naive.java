package string;
import java.util.Arrays;
import java.util.Scanner;
public class Anagram_Naive {
	
	public static boolean areAnagram(String str1, String str2)
	{
		if(str1.length() != str2.length())
		{
			return false;
		}
		char a1[] = str1.toCharArray();
		Arrays.sort(a1);
		str1 = new String(a1);
		
		char a2[] = str2.toCharArray();
		Arrays.sort(a2);
		str2 = new String(a2);
		
		return str1.equals(str2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		if(areAnagram(str1, str2))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}

}
