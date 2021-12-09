package pattern;
import java.util.Scanner;
public class pattern24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i =1;i<=n;i++)
		{
			for(int j = 0;j<i-1;j++)
			{
				System.out.print(" ");
			}
			for(int j = n-i+1;j>0;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
