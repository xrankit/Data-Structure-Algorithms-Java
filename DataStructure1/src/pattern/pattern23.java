package pattern;
import java.util.Scanner;
public class pattern23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0;i<n;i++)
		{
			for(int j = 1; j<=n;j++) 
			{
				System.out.print((char)('A'+j+i-1));
			}
			System.out.println();
		}
		
	}

}
