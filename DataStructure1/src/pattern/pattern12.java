package pattern;
import java.util.Scanner;
public class pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i =0;i<n;i++)
		{
			for (int j = 0; j<n;j++)
			{
				System.out.print((char)('A' + j));
			}
			System.out.println();
		}

	}

}
