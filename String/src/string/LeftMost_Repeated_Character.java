package string;

import java.util.Scanner;

public class LeftMost_Repeated_Character 
{
	public static final int CHAR = 256;
		public static int Leftmost_char(String str)
		{
			boolean []visited = new boolean[CHAR];
			int res = -1;
			 for(int i =str.length()-1;i>=0;i--)
			 {
				 if(visited[str.charAt(i)])
				 {
					 res = i;
				 }
				 else
				 {
					 visited[str.charAt(i)]=true;
				 }
			 }
			 return res;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		 System.out.println(str.charAt(Leftmost_char(str)));
	}

}
