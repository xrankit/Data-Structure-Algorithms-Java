package string;

import java.util.Scanner;

public class Anagram_Efficient {
	
	public static final int CHAR = 256;
	public static boolean areAnagram(String st1, String st2)
	{
		if(st1.length() != st2.length())
		{
			return false;
		}
		int count[] = new int[CHAR];
		for(int i =0;i<st1.length(); i++)
		{
			count[st1.charAt(i)]++;
			count[st2.charAt(i)]--;
		}
		for(int i =0; i < CHAR; i++)
		{
			if(count[i]!=0)
			{
				return false;
			}
		}
		return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String st1 = sc.nextLine();
		String st2 = sc.nextLine();
		
		if(areAnagram(st1, st2))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}

}
